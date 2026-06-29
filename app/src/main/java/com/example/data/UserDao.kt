package com.example.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(user: UserEntity): Long

    @Query("SELECT * FROM users WHERE username = :username AND isActive = 1")
    suspend fun getUserByUsername(username: String): UserEntity?

    @Query("SELECT * FROM users WHERE email = :email AND isActive = 1")
    suspend fun getUserByEmail(email: String): UserEntity?

    @Query("SELECT * FROM users WHERE username = :username AND passwordHash = :passwordHash AND isActive = 1")
    suspend fun authenticateUser(username: String, passwordHash: String): UserEntity?

    @Query("UPDATE users SET lastLogin = :timestamp WHERE id = :userId")
    suspend fun updateLastLogin(userId: Long, timestamp: Long)

    @Query("SELECT * FROM users WHERE id = :userId")
    suspend fun getUserById(userId: Long): UserEntity?
}
