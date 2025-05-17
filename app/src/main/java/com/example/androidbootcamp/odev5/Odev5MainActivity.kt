package com.example.androidbootcamp.odev5

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidbootcamp.R
import com.example.androidbootcamp.databinding.ActivityOdev5MainBinding

class Odev5MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOdev5MainBinding
    private var currentNumber = "0"
    private var firstNumber = 0
    private var currentOperation = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOdev5MainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        setupNumberButtons()
        setupOperationButtons()
    }

    private fun setupNumberButtons() {
        binding.apply {
            yedi.setOnClickListener { appendNumber("7") }
            sekiz.setOnClickListener { appendNumber("8") }
            dokuz.setOnClickListener { appendNumber("9") }
            dort.setOnClickListener { appendNumber("4") }
            bes.setOnClickListener { appendNumber("5") }
            alt.setOnClickListener { appendNumber("6") }
            bir.setOnClickListener { appendNumber("1") }
            iki.setOnClickListener { appendNumber("2") }
            uc.setOnClickListener { appendNumber("3") }
            sifirla.setOnClickListener { clearAll() }
        }
    }

    private fun setupOperationButtons() {
        binding.apply {
            topla.setOnClickListener { setOperation("+") }
            esittir.setOnClickListener { calculateResult() }
        }
    }

    private fun appendNumber(number: String) {
        currentNumber = if (currentNumber == "0") number else currentNumber + number
        updateDisplay()
    }

    private fun clearAll() {
        currentNumber = "0"
        firstNumber = 0
        currentOperation = ""
        updateDisplay()
    }

    private fun setOperation(operation: String) {
        firstNumber = currentNumber.toIntOrNull() ?: 0
        currentOperation = operation
        currentNumber = "0"
    }

    private fun calculateResult() {
        if (currentOperation.isNotEmpty()) {
            val secondNumber = currentNumber.toIntOrNull() ?: 0
            currentNumber = when (currentOperation) {
                "+" -> (firstNumber + secondNumber).toString()
                else -> currentNumber
            }
            currentOperation = ""
            updateDisplay()
        }
    }

    private fun updateDisplay() {
        binding.sonuc.text = currentNumber
    }
}