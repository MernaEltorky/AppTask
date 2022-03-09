package com.example.apptask.recyclerViewProduct

import retrofit2.Call
import retrofit2.http.GET

interface ProductApi {


    @GET("116")
    fun getProduct(): Call<Product?>?

}