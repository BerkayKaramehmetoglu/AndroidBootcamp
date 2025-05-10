package com.example.androidbootcamp.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.androidbootcamp.R
import com.example.androidbootcamp.databinding.FragmentSayfaBBinding

class SayfaB : Fragment() {
    private lateinit var binding: FragmentSayfaBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaBBinding.inflate(inflater, container, false)

        binding.gitY.setOnClickListener {
            it.findNavController().navigate(R.id.sayfaBYgit)
        }

        return binding.root
    }

}