package com.example.mylistsample2.ui.main

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.mylistsample.ui.main.OmdbApi
import kotlinx.coroutines.launch
import androidx.lifecycle.viewModelScope
import retrofit2.Retrofit


class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("http://www.omdbapi.com/")
            .build()
        val api = retrofit.create(OmdbApi::class.java);

        viewModelScope.launch {
            val result = api.getAllMovies("inseption")
            result.body()?.movies.forEach {
                Log.e("!@#", it.name)
            }
        }
    }
}