package com.example.androidbootcamp.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.Navigator
import com.example.androidbootcamp.R
import com.example.androidbootcamp.databinding.FragmentOdev4Binding
import androidx.navigation.findNavController

class Odev4Fragment : Fragment() {
    private lateinit var binding: FragmentOdev4Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOdev4Binding.inflate(inflater, container, false)

        binding.gitA.setOnClickListener {
            it.findNavController().navigate(R.id.sayfaAgit)
        }

        binding.gitX.setOnClickListener {
            it.findNavController().navigate(R.id.sayfaXgit)
        }

        return binding.root
    }

}