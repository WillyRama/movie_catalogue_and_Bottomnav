package com.example.movie_catalogue

import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=0ba708223346c1eec013ffb82a653da7")
    fun getMovieList(): Call<MovieResponse>
}
