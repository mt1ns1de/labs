package com.example.lab7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.lab7.databinding.FragmentDisplayBinding

class DisplayFragment : Fragment(R.layout.fragment_display) {
    private var _binding: FragmentDisplayBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentDisplayBinding.bind(view)

        val args = DisplayFragmentArgs.fromBundle(requireArguments())
        binding.displayStreet.text = args.street
        binding.displayCity.text = args.city
        binding.displayPostalCode.text = args.postalCode
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}