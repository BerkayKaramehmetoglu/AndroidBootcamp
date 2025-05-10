package com.example.androidbootcamp.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.androidbootcamp.R
import com.example.androidbootcamp.databinding.FragmentSayfaXBinding

class SayfaX : Fragment() {
    private lateinit var binding: FragmentSayfaXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaXBinding.inflate(inflater, container, false)

        binding.gitY.setOnClickListener {
            it.findNavController().navigate(R.id.sayfaYgit)
        }

        return binding.root
    }

}