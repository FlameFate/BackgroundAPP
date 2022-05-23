package com.example.backgroundapp.model


import com.example.backgroundapp.data.WallpaperApi
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiInterface {

    @GET("api/?key=21194026-a9b46665d99755d852a93eb05&q&orientation=vertical&category=backgrounds")
    fun getMovies() : Call<WallpaperApi>

    @GET("api/?key=21194026-a9b46665d99755d852a93eb05&q&orientation=vertical&category=fashion")
    fun getFashion() : Call<WallpaperApi>
    @GET("api/?key=21194026-a9b46665d99755d852a93eb05&q&orientation=vertical&category=business")
    fun getBusiness() : Call<WallpaperApi>

    companion object {

        var BASE_URL = "https://pixabay.com/"

        fun create() : ApiInterface {

            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(ApiInterface::class.java)

        }
    }
}