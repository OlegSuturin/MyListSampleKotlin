

package com.example.mylistsample.ui.main

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface OmdbApi {
    @GET( value = "/")
    suspend fun getAllMovies(@Query("s") searsh: String,
                     @Query("apiKey") apiKey: String = "3172e14f"
    ):Response<MovieResponse>
}