package com.example.meteopasla.Room.DAO

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.meteopasla.Room.Entity.VilleEntity

@Dao

interface VilleDAO{
    @Query("SELECT * FROM Ville")
    fun getAll(): List<VilleEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(ville: VilleEntity)
}