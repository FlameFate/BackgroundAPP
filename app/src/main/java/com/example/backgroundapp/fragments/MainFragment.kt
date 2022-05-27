package com.example.backgroundapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.backgroundapp.databinding.FragmentMainBinding


class MainFragment : Fragment() {
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

    companion object {

        @JvmStatic
        fun newInstance() =
            MainFragment()
    }
}