package com.example.jetpacknavigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.jetpacknavigationsample.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        setupButtons()
        return binding.root
    }

    private fun setupButtons() {
        binding.whiteCatsButton.setOnClickListener { view ->
            val action = MainFragmentDirections.actionMainFragmentToWhiteCatsFragment()
            view.findNavController().navigate(action)
        }

        binding.blackCatsButton.setOnClickListener { view ->
            val action = MainFragmentDirections.actionMainFragmentToBlackCatsFragment()
            view.findNavController().navigate(action)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}