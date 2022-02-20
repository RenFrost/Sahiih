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
import com.example.sahiih.MainActivity
import com.example.sahiih.R

import com.example.sahiih.databinding.HomeFragmentBinding

class HomeFragment : Fragment() {

    private var viewModel: SharedViewModel? = null
    private var _binding: HomeFragmentBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView
                (inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {
        _binding = HomeFragmentBinding.inflate(inflater, container, false)
        val view = binding.root

        (requireActivity() as MainActivity).title = "Sahih"

        val foodsBtn : ImageButton = binding.foodsButton
        val drinksBtn : ImageButton = binding.drinksButton
        val geneticsBtn : ImageButton = binding.geneticsButton
        val biologyBtn : ImageButton = binding.biologyButton
        val cosmeticsBtn : ImageButton = binding.cosmeticsButton
        val goodsBtn : ImageButton = binding.goodsButton
        val medicinesBtn : ImageButton = binding.medicinesButton
        val chemicalsBtn : ImageButton = binding.chemicalsButton

        foodsBtn.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_productFragment)
            (requireActivity() as MainActivity).title = "Foods"
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    }

