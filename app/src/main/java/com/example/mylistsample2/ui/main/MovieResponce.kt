package com.example.mylistsample.ui.main

import com.example.mylistsample2.ui.main.Movie
import com.google.gson.annotations.SerializedName

data class MovieResponse (
    @SerializedName("Search")
    val movies : List<Movie>
)