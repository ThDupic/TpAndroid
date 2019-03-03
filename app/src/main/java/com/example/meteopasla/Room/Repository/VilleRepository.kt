package com.example.meteopasla.Room.Repository

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.example.meteopasla.Room.DAO.VilleDAO
import com.example.meteopasla.Room.Entity.VilleEntity

class VilleRepository(private val villeDAO: VilleDAO) {
    val allCity: List<VilleEntity> = villeDAO.getAll()

    @WorkerThread
    suspend fun insert(ville: VilleEntity){
        villeDAO.insert(ville)
    }
}