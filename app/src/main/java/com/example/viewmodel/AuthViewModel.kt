package com.example.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.AppDatabase
import com.example.data.User
import kotlinx.coroutines.launch

class AuthViewModel(application: Application) : AndroidViewModel(application) {
    private val userDao = AppDatabase.getDatabase(application).userDao()

    fun register(username: String, email: String, password: String) {
        viewModelScope.launch {
            userDao.insert(User(username = username, email = email, passwordHash = password.hashCode().toString()))
        }
    }
}
