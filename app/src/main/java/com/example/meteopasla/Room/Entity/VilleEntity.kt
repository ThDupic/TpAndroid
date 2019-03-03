package com.example.meteopasla.Room.Entity
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Ville")
data class VilleEntity(@PrimaryKey(autoGenerate = true) val id: Long,
                       var ville: String,
                       var temperature: Double)