package com.example.backgroundapp.fragments

import CustomAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.backgroundapp.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    //private var layoutManager: RecyclerView.LayoutManager? = null
   // private var adapter: RecyclerView.Adapter<CustomAdapter.ViewHolder>? = null
    private var bindingClass: FragmentMainBinding? = null


    // with the backing property of the kotlin
    // we extract
    // the non null value of the _binding
    private val binding get() = bindingClass!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        bindingClass = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    //override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        //super.onViewCreated(itemView, savedInstanceState)
        //recycler.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
           // layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
           // adapter = CustomAdapter()
        //}
  //  }
    companion object {

        @JvmStatic
        fun newInstance() =
            MainFragment()
    }
}