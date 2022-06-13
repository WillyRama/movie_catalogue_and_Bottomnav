package com.example.movie_catalogue

import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=21aada851713c086f599c5043491bca2")
    fun getMovieList(): Call<MovieResponse>
}
