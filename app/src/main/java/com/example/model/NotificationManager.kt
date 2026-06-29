package com.example.model

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

data class Notification(val id: String, val message: String, val type: String)

object NotificationManager {
    private val _notifications = MutableStateFlow<List<Notification>>(emptyList())
    val notifications: StateFlow<List<Notification>> = _notifications

    fun addNotification(message: String, type: String = "INFO") {
        val newNotification = Notification(System.currentTimeMillis().toString(), message, type)
        _notifications.value = _notifications.value + newNotification
    }

    fun dismissNotification(id: String) {
        _notifications.value = _notifications.value.filterNot { it.id == id }
    }
}
