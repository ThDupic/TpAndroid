package com.example.meteopasla.API

import com.google.gson.GsonBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ControllerMeteo : Callback<List<ChangeMeteo>> {

    val BASE_URL = "http://maps.openweathermap.org/maps/2.0/weather/"

    fun start(){
        var gson = GsonBuilder().setLenient().create()

        var retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create(gson)).build()

        var meteoApi = retrofit.create(IMeteoService::class.java)

        var call = meteoApi.requestAll()

        call.enqueue(object : Callback<ChangeMeteo> {
            override fun onResponse(call: Call<List<ChangeMeteo>>, response: Response<List<ChangeMeteo>>) {
                if(response.isSuccessful()){
                    var changeList = response.body()
                }
            }
            override fun onFailure(call: Call<List<ChangeMeteo>>, t: Throwable) {
                t.printStackTrace()
            }

        })

    }

    /*override fun onFailure(call: Call<List<ChangeMeteo>>, t: Throwable) {
        t.printStackTrace()
    }

    override fun onResponse(call: Call<List<ChangeMeteo>>, response: Response<List<ChangeMeteo>>) {
        if(response.isSuccessful()){
            var changeList = response.body()

        }
    }*/
}