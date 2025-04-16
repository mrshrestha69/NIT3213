package com.example.finalassignment.utils

class LoginValidator {
    fun isValidLogin(username: String, password: String): Boolean {
        return username.isNotBlank() && password.length >= 6
    }
}
