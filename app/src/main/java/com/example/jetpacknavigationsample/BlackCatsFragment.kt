package com.example.jetpacknavigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.jetpacknavigationsample.databinding.FragmentBlackCatsBinding

class BlackCatsFragment : Fragment() {
    private var _binding: FragmentBlackCatsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBlackCatsBinding.inflate(inflater, container, false)
        setupButtons()
        return binding.root
    }

    private fun setupButtons() {
        binding.detailButton.setOnClickListener { view ->
            val action = BlackCatsFragmentDirections.showCatDetail(512)
            view.findNavController().navigate(action)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}