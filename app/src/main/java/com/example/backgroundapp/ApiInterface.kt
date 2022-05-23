package com.example.backgroundapp


import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiInterface {

    @GET("?key=21194026-a9b46665d99755d852a93eb05&q&orientation=vertical&category=backgrounds")
    fun getMovies() : Call<WallpaperApi>

    companion object {

        var BASE_URL = "https://pixabay.com/api/"

        fun create() : ApiInterface {

            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(ApiInterface::class.java)

        }
    }
}