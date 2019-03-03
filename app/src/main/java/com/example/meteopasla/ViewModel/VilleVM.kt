package com.example.meteopasla.ViewModel

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.example.meteopasla.Room.Entity.VilleEntity
import com.example.meteopasla.Room.Repository.VilleRepository
import com.example.meteopasla.Room.RoomDatabase.MeteoDataBase

class VilleVM(application: Application) : AndroidViewModel(application){
    private var repository: VilleRepository
    var allCity: List<VilleEntity>

    init{
        var villeDao = MeteoDataBase.getDatabase(application).VilleDAO()
        repository = VilleRepository(villeDao)
        allCity = repository.allCity

    }
}