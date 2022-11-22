package com.example.jetpacknavigationsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.jetpacknavigationsample.databinding.FragmentBlackCatsBinding

class BlackCatsFragment : Fragment(R.layout.fragment_black_cats) {
    private val binding by viewBinding(FragmentBlackCatsBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupButtons()
    }

    private fun setupButtons() {
        binding.detailButton.setOnClickListener { view ->
            val action = BlackCatsFragmentDirections.showCatDetail(512)
            view.findNavController().navigate(action)
        }
    }
}