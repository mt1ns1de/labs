package com.example.lab7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.lab7.databinding.FragmentAddressBinding

class AddressFragment : Fragment(R.layout.fragment_address) {
    private var _binding: FragmentAddressBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentAddressBinding.bind(view)

        binding.nextButton.setOnClickListener {
            val action = AddressFragmentDirections.actionAddressFragmentToDisplayFragment(
                street = binding.streetEditText.text.toString(),
                city = binding.cityEditText.text.toString(),
                postalCode = binding.postalCodeEditText.text.toString()
            )
            findNavController().navigate(action)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}