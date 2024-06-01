package com.example.job_02_tanjidul_01062024.Database

import UserProfile
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface UserProfileDao {
    @Insert
    suspend fun insert(userProfile: UserProfile)

    @Update
    suspend fun update(userProfile: UserProfile)

    @Delete
    suspend fun delete(userProfile: UserProfile)

    @Query("SELECT * FROM user_profile")
    fun getAllUserProfiles(): LiveData<List<UserProfile>>
}