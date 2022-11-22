package com.example.jetpacknavigationsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.jetpacknavigationsample.databinding.FragmentConcreteCatBinding

class ConcreteCatFragment : Fragment(R.layout.fragment_concrete_cat) {
    private val binding by viewBinding(FragmentConcreteCatBinding::bind)

    private val args: ConcreteCatFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.catNameView.text = "Cat ID: ${args.catId}"
    }
}