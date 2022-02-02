package com.example.sahiih.data

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ProductApi {
    @GET("")
    suspend fun getPictures(@Path("page") page: Int): Response<List<Products>>
}