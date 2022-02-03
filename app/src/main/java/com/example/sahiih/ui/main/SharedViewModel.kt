package com.example.sahiih.ui.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sahiih.data.ProductsData
import com.example.sahiih.data.ProductsRepository

private const val  LOG_TAG = "SharedViewModel"

class SharedViewModel(app: Application) : AndroidViewModel(app) {

    val products: MutableLiveData<List<ProductsData>> = MutableLiveData()

    var productsRepository: ProductsRepository = ProductsRepository()

//    init {
//        val data = productsRepository.getProducts(app)
//        data?.let {
//            products.value = it
//        }
//    }


}