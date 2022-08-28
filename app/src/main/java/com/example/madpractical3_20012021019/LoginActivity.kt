package com.example.madpractical3_20012021019

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.madpractical3_20012021019.databinding.ActivityLoginBinding
import com.example.madpractical3_20012021019.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
    }
}