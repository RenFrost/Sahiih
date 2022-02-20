package com.example.sahiih.ui.main

import androidx.lifecycle.*
import com.example.sahiih.data.ProductsData
import com.example.sahiih.data.ProductsRepository

private const val  LOG_TAG = "SharedViewModel"

class SharedViewModel: ViewModel() {

    var productRepository: ProductsRepository = ProductsRepository()

    val selectedProduct: MutableLiveData<ProductsData> = MutableLiveData()

    val products: LiveData<List<ProductsData>> = liveData {
        val data = productRepository.getProducts()
        emit(data)
    }
}