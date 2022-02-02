package com.example.sahiih.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

private const val  LOG_TAG = "SharedViewModel"

class SharedViewModel : ViewModel() {

    private val _info : MutableLiveData<Int> = MutableLiveData()
    val info: LiveData<Int> = _info

    init {
        Log.i("SharedViewModel", "created")
        _info.value = 0
    }

    fun loadData() {
        _info.value = _info.value!! + 1
        Log.i(LOG_TAG, "current value: ${_info.value}")
    }
}