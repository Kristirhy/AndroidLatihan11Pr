package com.example.androidlatihan11pr.model

import com.google.gson.annotations.SerializedName

class Movie (@SerializedName("original_title") val originalTitle : String?,
    @SerializedName("overview") val overview : String?,
    @SerializedName("poster_path") val posterPath : String?)
