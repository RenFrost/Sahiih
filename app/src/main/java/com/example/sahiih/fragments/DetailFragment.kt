package com.example.sahiih.fragments

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import coil.load
import com.example.sahiih.databinding.FragmentDetailBinding
import com.example.sahiih.ui.main.SharedViewModel


class DetailFragment : Fragment() {

    private var viewModel: SharedViewModel? = null
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        (activity as AppCompatActivity?)!!.supportActionBar!!.hide()

        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.N)
    @SuppressLint("StringFormatMatches")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = activity?.run {
            ViewModelProvider(requireActivity())[SharedViewModel::class.java]
        }

        viewModel?.selectedProduct?.observe(viewLifecycleOwner, { product ->
            with(product) {
                binding.productImage.load(imageFile)
//                binding.productNameText.text = productName
//                binding.descriptionText.text = description
//                binding.sizeText.text = getString(R.string.product_size_label, size)
//                binding.priceText.text = NumberFormat.getCurrencyInstance().format(price)
            }
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        (activity as AppCompatActivity?)!!.supportActionBar!!.show()

    }
}