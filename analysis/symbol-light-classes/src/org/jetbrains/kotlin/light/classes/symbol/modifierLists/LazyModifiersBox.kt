/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.light.classes.symbol.modifierLists

import com.intellij.psi.PsiModifier
import com.intellij.util.concurrency.AtomicFieldUpdater
import kotlinx.collections.immutable.PersistentMap
import kotlinx.collections.immutable.toPersistentHashMap
import org.jetbrains.kotlin.analysis.api.symbols.markers.KtSymbolWithModality
import org.jetbrains.kotlin.analysis.api.symbols.markers.KtSymbolWithVisibility
import org.jetbrains.kotlin.analysis.api.symbols.pointers.KtSymbolPointer
import org.jetbrains.kotlin.analysis.project.structure.KtModule
import org.jetbrains.kotlin.light.classes.symbol.computeSimpleModality
import org.jetbrains.kotlin.light.classes.symbol.toPsiVisibilityForMember
import org.jetbrains.kotlin.light.classes.symbol.withSymbol
import org.jetbrains.kotlin.utils.keysToMap

internal typealias LazyModifiersComputer = (modifier: String) -> Map<String, Boolean>?

internal class LazyModifiersBox(
    initialValue: Map<String, Boolean> = emptyMap(),
    private val computer: LazyModifiersComputer,
) : ModifiersBox {
    @Volatile
    private var modifiersMapReference: PersistentMap<String, Boolean> = initialValue.toPersistentHashMap()

    override fun hasModifier(modifier: String): Boolean {
        modifiersMapReference[modifier]?.let { return it }

        val newValues = computer(modifier) ?: mapOf(modifier to false)
        do {
            val currentMap = modifiersMapReference
            currentMap[modifier]?.let { return it }

            val newMap = currentMap.putAll(newValues)
        } while (fieldUpdater.compareAndSet(/* owner = */ this, /* expected = */ currentMap, /* newValue = */ newMap))

        return newValues[modifier] ?: error("Inconsistent state: $modifier")
    }

    companion object {
        private val fieldUpdater = AtomicFieldUpdater.forFieldOfType(LazyModifiersBox::class.java, PersistentMap::class.java)

        internal val VISIBILITY_MODIFIERS = setOf(PsiModifier.PUBLIC, PsiModifier.PACKAGE_LOCAL, PsiModifier.PROTECTED, PsiModifier.PRIVATE)
        internal val VISIBILITY_MODIFIERS_MAP: PersistentMap<String, Boolean> =
            VISIBILITY_MODIFIERS.keysToMap {
                false
            }.toPersistentHashMap()

        internal val MODALITY_MODIFIERS = setOf(PsiModifier.FINAL, PsiModifier.ABSTRACT)
        internal val MODALITY_MODIFIERS_MAP: PersistentMap<String, Boolean> =
            MODALITY_MODIFIERS.keysToMap {
                false
            }.toPersistentHashMap()

        internal fun computeVisibilityForMember(
            ktModule: KtModule,
            declarationPointer: KtSymbolPointer<KtSymbolWithVisibility>,
        ): PersistentMap<String, Boolean> {
            val visibility = declarationPointer.withSymbol(ktModule) {
                it.toPsiVisibilityForMember()
            }

            return VISIBILITY_MODIFIERS_MAP.with(visibility)
        }

        internal fun computeSimpleModality(
            ktModule: KtModule,
            declarationPointer: KtSymbolPointer<KtSymbolWithModality>,
        ): PersistentMap<String, Boolean> {
            val modality = declarationPointer.withSymbol(ktModule) {
                it.computeSimpleModality()
            }

            return MODALITY_MODIFIERS_MAP.with(modality)
        }
    }

}

@Suppress("NOTHING_TO_INLINE")
internal inline fun PersistentMap<String, Boolean>.with(modifier: String?): PersistentMap<String, Boolean> {
    return modifier?.let { put(modifier, true) } ?: this
}
