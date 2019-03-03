package com.example.meteopasla.Room.RoomDatabase

import android.app.Application
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.meteopasla.Room.DAO.VilleDAO
import com.example.meteopasla.Room.Entity.VilleEntity

@Database(entities = [VilleEntity::class], version = 1)
public abstract class MeteoDataBase: RoomDatabase(){
    abstract fun VilleDAO(): VilleDAO

    companion object {
        @Volatile
        private var INSTANCE: MeteoDataBase? = null

        fun getDatabase(context: Context): MeteoDataBase {
            return INSTANCE ?: synchronized(this) {

                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MeteoDataBase::class.java,
                    "MeteoDatabase"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }


}
