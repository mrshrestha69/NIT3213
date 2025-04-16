package com.example.finalassignment.utils

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class LoginValidatorTest {

    private lateinit var validator: LoginValidator

    @Before
    fun setup() {
        validator = LoginValidator()
    }

    @Test
    fun `valid username and password returns true`() {
        val result = validator.isValidLogin("Saurab", "s4683605")
        assertTrue(result)
    }

    @Test
    fun `blank username returns false`() {
        val result = validator.isValidLogin("", "s4683605")
        assertFalse(result)
    }

    @Test
    fun `short password returns false`() {
        val result = validator.isValidLogin("Saurab", "s46836")
        assertFalse(result)
    }

    @Test
    fun `blank username and short password returns false`() {
        val result = validator.isValidLogin("", "")
        assertFalse(result)
    }
}
