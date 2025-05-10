package com.example.androidbootcamp.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.androidbootcamp.R
import com.example.androidbootcamp.databinding.FragmentSayfaYBinding

class SayfaY : Fragment() {
    private lateinit var binding: FragmentSayfaYBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaYBinding.inflate(inflater, container, false)

        binding.gitAnaSayfa.setOnClickListener {
            it.findNavController().navigate(R.id.gitAnaSayfa)
        }

        return binding.root
    }

}