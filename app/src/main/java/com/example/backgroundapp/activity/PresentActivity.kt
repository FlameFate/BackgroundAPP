package com.example.backgroundapp.activity

import CustomAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.backgroundapp.R
import com.example.backgroundapp.data.WallpaperApi
import com.example.backgroundapp.model.ApiInterface
import com.example.backgroundapp.data.BGItem
import com.example.backgroundapp.databinding.ActivityPresentBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PresentActivity : AppCompatActivity() {

    lateinit var bindingClass: ActivityPresentBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityPresentBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)


        // this creates a vertical layout Manager
        recyclerview.layoutManager = GridLayoutManager(this,2)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<BGItem>()

        // This loop will create 20 Views containing
        // the image with the count of view
        for (i in 1..20) {
            data.add(BGItem(R.drawable.ic_baseline_backpack_24, "Item " + i))
        }

        // This will pass the ArrayList to our Adapter


        val apiInterface = ApiInterface.create().getMovies()

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


    }

}