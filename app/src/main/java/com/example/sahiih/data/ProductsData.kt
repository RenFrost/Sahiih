package com.example.sahiih.data

import android.nfc.tech.NfcBarcode
import java.net.URL
import java.util.*

data class ProductsData (
        val productName: String,
        val imageFile: String,
        val description: String,
        val size: Int,
        val price: Double
//    val name: String,
//    val productsImgUrl: String,
//    val productsCategory: String,
//    val certificationBody: String,
//    val productsBrand: String,
//    val productsDescription: String,
//    val validUntilDate: Date,
//    val madeIn: String,
//    val certificationNumber: Int,
//    val dataSource: String,
////    val barcode: NfcBarcode
//    val productsNote: String,
//    val warning: String,
//    val potentialAllergy: String,
//    val ingredientInformation: String,
//    val distributionPermissionNumber: Int,
)