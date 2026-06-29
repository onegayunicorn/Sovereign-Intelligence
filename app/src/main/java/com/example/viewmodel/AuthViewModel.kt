package com.example.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.AppDatabase
import com.example.data.UserEntity
import kotlinx.coroutines.launch

class AuthViewModel(application: Application) : AndroidViewModel(application) {
    private val userDao = AppDatabase.getDatabase(application).userDao()

    fun register(username: String, email: String, fullName: String, password: String) {
        viewModelScope.launch {
            userDao.insertUser(UserEntity(username = username, email = email, fullName = fullName, passwordHash = password.hashCode().toString()))
        }
    }
}
