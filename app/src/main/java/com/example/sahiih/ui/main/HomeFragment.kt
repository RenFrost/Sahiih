package com.example.sahiih.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sahiih.R
import com.example.sahiih.databinding.HomeFragmentBinding
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener

class HomeFragment : Fragment() {

    private var _binding: HomeFragmentBinding? = null
    private val binding get() = _binding!!

//    var imageArray: ArrayList<Int> = ArrayList()
//    var carouselView: CarouselView? = null

    override fun onCreateView
                (inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {

//       imageArray.add(R.drawable.image_1)
//       imageArray.add(R.drawable.image_2)
//       imageArray.add(R.drawable.image_3)
//       imageArray.add(R.drawable.image_4)
//       imageArray.add(R.drawable.image_5)

//       carouselView!!.pageCount = imageArray.size

//       carouselView!!.setImageListener(imageListener)
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

