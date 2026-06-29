package com.example.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val username: String,
    val email: String,
    val fullName: String,
    val passwordHash: String,
    val workspace: String = "default",
    val createdAt: Long = System.currentTimeMillis(),
    val lastLogin: Long? = null,
    val isActive: Boolean = true
)

data class UserSession(
    val userId: Long,
    val username: String,
    val workspace: String,
    val token: String,
    val expiresAt: Long
)
