package com.example.ninepatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ninepatch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            binding.textView.text = resources.getString(R.string.cadena_larga)
        }
    }
}