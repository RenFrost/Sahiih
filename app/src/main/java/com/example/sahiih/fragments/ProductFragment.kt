package com.example.sahiih.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sahiih.LOG_TAG
import com.example.sahiih.MainActivity
import com.example.sahiih.R
import com.example.sahiih.adapter.ProductAdapter
import com.example.sahiih.data.ProductsData
import com.example.sahiih.databinding.ProductFragmentBinding
import com.example.sahiih.ui.main.SharedViewModel

class ProductFragment : Fragment() {

    private var viewModel: SharedViewModel? = null
    private var _binding: ProductFragmentBinding? = null
    private val binding get() = _binding!!

    private val onItemClick: (ProductsData) -> Unit = { product ->
        Log.i(LOG_TAG, "the selected product: $product")
        viewModel?.selectedProduct?.value = product
        findNavController().navigate(R.id.action_productFragment_to_detailFragment)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = ProductFragmentBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (requireActivity() as MainActivity).title = "Foods"

        viewModel = activity?.run {
            ViewModelProvider(requireActivity())[SharedViewModel::class.java]
        }

        viewModel?.products?.observe(viewLifecycleOwner, { products ->
            binding.productList.adapter = ProductAdapter(products, onItemClick)
        })

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}