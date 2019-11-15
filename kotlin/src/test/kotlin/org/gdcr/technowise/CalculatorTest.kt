/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package org.gdcr.technowise

import kotlin.test.Test
import kotlin.test.assertEquals

class CalculatorTest {
    @Test
    fun `should add two numbers`() {
        val calculator = Calculator()
        assertEquals(0, calculator.add(0, 0))
        assertEquals(6, calculator.add(4, 2))
        assertEquals(-10, calculator.add(-3, -7))
    }
}
