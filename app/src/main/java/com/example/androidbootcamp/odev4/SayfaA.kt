package com.example.androidbootcamp.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.androidbootcamp.R
import com.example.androidbootcamp.databinding.FragmentSayfaABinding

class SayfaA : Fragment() {
    private lateinit var binding: FragmentSayfaABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaABinding.inflate(inflater, container, false)

        binding.gitB.setOnClickListener {
            it.findNavController().navigate(R.id.sayfaBgit)
        }

        return binding.root
    }

}