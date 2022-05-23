package com.example.backgroundapp

import CustomAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.backgroundapp.databinding.ActivityBusinessBinding
import com.example.backgroundapp.databinding.ActivityFashionBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BusinessActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityBusinessBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityBusinessBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = GridLayoutManager(this,2)

        // ArrayList of class ItemsViewModel


        // This will pass the ArrayList to our Adapter


        val apiInterface = ApiInterface.create().getBusiness()

        //apiInterface.enqueue( Callback<List<Movie>>())
        apiInterface.enqueue( object : Callback<WallpaperApi> {
            override fun onResponse(call: Call<WallpaperApi>?, response: Response<WallpaperApi>?) {
                val adapter = CustomAdapter(response?.body()?.hits)

                // Setting the Adapter with the recyclerview
                recyclerview.adapter = adapter
                // if(response?.body() != null)
                // recyclerAdapter.setMovieListItems(response.body()!!)
            }



            override fun onFailure(call: Call<WallpaperApi>?, t: Throwable?) {

            }

        })
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)


    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)


    }}