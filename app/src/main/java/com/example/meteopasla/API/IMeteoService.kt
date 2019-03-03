package com.example.meteopasla.API

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface IMeteoService {

    @Headers("appid: 1b9be9ec370aa6576561ef7bdd7d7a4a", "Accept: application/json")

    @GET()
    fun requestAll() : Call<String>
}