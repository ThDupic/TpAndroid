package com.example.meteopasla.API

class ChangeMeteo {

    lateinit var sujet: String

    fun getSujetMeteo(): String {
        return sujet
    }

    fun setSujetMeteo(sujet: String){
        this.sujet = sujet
    }
}