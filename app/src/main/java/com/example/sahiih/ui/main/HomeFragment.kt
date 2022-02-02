package com.example.sahiih.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.sahiih.R
import com.example.sahiih.adapter.ImageSliderAdapter
import com.example.sahiih.data.ImageData
import com.example.sahiih.databinding.HomeFragmentBinding

class HomeFragment : Fragment() {

    private var _binding: HomeFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView
                (inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {


        _binding = HomeFragmentBinding.inflate(inflater, container, false)
        val view = binding.root

        return view
    }
//    var imageListener = ImageListener {position, imageView -> imageView.setImageResource(imageArray[position])}

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    }
//    var imageListener = ImageListener {position, imageView -> imageView.setImageResource(imageArray[position])}

