package com.example.sahiih.data

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ProductApi {
    @GET("")
    fun getProducts(@Path("page") page: Int): Response<List<ProductsData>>
}