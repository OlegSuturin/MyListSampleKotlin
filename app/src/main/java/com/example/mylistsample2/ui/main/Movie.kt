package com.example.mylistsample2.ui.main

import com.google.gson.annotations.SerializedName

data class Movie (
    @SerializedName ("Title")
    val name: String
)