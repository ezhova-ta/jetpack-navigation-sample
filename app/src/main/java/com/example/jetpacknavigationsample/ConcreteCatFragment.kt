package com.example.jetpacknavigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.jetpacknavigationsample.databinding.FragmentConcreteCatBinding

class ConcreteCatFragment : Fragment() {
    private var _binding: FragmentConcreteCatBinding? = null
    private val binding get() = _binding!!

    private val args: ConcreteCatFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentConcreteCatBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.catNameView.text = "Cat ID: ${args.catId}"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}