package com.example.androidbootcamp.odev6

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidbootcamp.databinding.CardViewBinding

class Odev6Adapter(var context: Context, var haberList: List<Haber>) :
    RecyclerView.Adapter<Odev6Adapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(var binding: CardViewBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = CardViewBinding.inflate(
            LayoutInflater.from(context), parent, false
        )
        return CardTasarimTutucu(binding)
    }

    override fun getItemCount(): Int {
        return haberList.size
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val haber = haberList[position]
        val design = holder.binding

        design.haberResim.setImageResource(haber.image)
        design.haberAjansAdi.text = haber.haber_ajans_adi
        design.haberAciklama.text = haber.haber_aciklama
        design.haberZamani.text = haber.haber_zamani


    }
}