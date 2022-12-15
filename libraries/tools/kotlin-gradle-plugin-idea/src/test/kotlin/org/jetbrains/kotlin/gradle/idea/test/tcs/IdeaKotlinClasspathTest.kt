/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.gradle.idea.test.tcs

import org.jetbrains.kotlin.gradle.idea.tcs.IdeaKotlinClasspath
import java.io.File
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class IdeaKotlinClasspathTest {

    @Test
    fun `test - equals`() {
        val first = IdeaKotlinClasspath()
        val second = IdeaKotlinClasspath()

        assertEquals(first, second)

        first.add(File("a"))
        assertNotEquals(first, second)

        second.add(File("a").absoluteFile)
        assertEquals(first, second)

        assertEquals(first, IdeaKotlinClasspath(File("a")))
    }

    @Test
    fun `test - stores files absolute`() {
        val classpath = IdeaKotlinClasspath()
        classpath.add(File("test"))

        assertNotEquals(classpath.toSet(), setOf(File("test")))
        assertEquals(classpath.toSet(), setOf(File("test").absoluteFile))
    }

    @Test
    fun `test - contains file - relative and absolute`() {
        val classpath = IdeaKotlinClasspath()
        classpath.add(File("test"))

        assertTrue(File("test") in classpath)
        assertTrue(File("test").absoluteFile in classpath)
    }

    @Test
    fun `test - remove file - relative and absolute`() {
        val classpath = IdeaKotlinClasspath()
        classpath.add(File("test"))

        assertTrue(classpath.isNotEmpty())
        classpath.remove(File("test"))
        assertTrue(classpath.isEmpty())

        classpath.add(File("test"))
        assertTrue(classpath.isNotEmpty())
        classpath.remove(File("test").absoluteFile)
        assertTrue(classpath.isEmpty())
    }
}