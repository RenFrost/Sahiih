package com.example.sahiih.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.sahiih.R

import com.example.sahiih.databinding.HomeFragmentBinding
import com.example.sahiih.fragments.FoodFragment

class HomeFragment : Fragment() {

    private var viewModel: SharedViewModel? = null
    private var _binding: HomeFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView
                (inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {
        _binding = HomeFragmentBinding.inflate(inflater, container, false)

        val foodBtn : ImageButton = binding.foodsButton
        foodBtn.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_foodFragment)
        }



        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    }

