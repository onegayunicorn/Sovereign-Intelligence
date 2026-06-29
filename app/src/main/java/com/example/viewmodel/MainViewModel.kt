package com.example.viewmodel

import androidx.lifecycle.ViewModel
import com.example.model.AppData
import com.example.model.AppDataSource
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel : ViewModel() {
    private val _uiState = MutableStateFlow<AppData>(AppDataSource.appData)
    val uiState: StateFlow<AppData> = _uiState
}
