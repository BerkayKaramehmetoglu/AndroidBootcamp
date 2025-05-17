package com.example.androidbootcamp.odev6

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidbootcamp.R
import com.example.androidbootcamp.databinding.ActivityOdev6MainBinding

class Odev6MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOdev6MainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOdev6MainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()

        binding.haberRV.layoutManager = LinearLayoutManager(this@Odev6MainActivity)

        val haberList = listOf(
            Haber(
                R.drawable.haber_image1,
                "BBC TÜRKÇE",
                "EN MUTLU GÜNÜNDE BÜYÜK TALİHSİZLİK: DİSKO TOPU GELİNİN ÜSTÜNE DÜŞTÜ",
                "1 SAAT"
            ),
            Haber(
                R.drawable.haber_image2,
                "DONANIM HABER",
                "IPHONE 17 AIR IÇIN SÜRPRİZ GELİŞME: PİL TEKNOLOJİSİYLE İLK OLABİLİR", "2 SAAT"
            ),
            Haber(
                R.drawable.haber_image3,
                "BBC TÜRKÇE",
                "AVRUPA BİRLİĞİ 2024 VERİLERİNİ AÇIKLADI: SCHENGEN VİZESİ BAŞVURULARI ARTIYOR, RET ORANI DÜŞÜYOR.",
                "30 DAKİKA"
            ),
        )

        val adapter = Odev6Adapter(this@Odev6MainActivity, haberList)
        binding.haberRV.adapter = adapter
    }
}