package com.example.showherodota.network

import com.squareup.moshi.Json


data class dotaPhotos (
    val name: String
    , val attribute:String,
    @Json (name = "frase")val stringResourceId1:String,
   @Json(name = "photo") val imageResourceId1: Int)
