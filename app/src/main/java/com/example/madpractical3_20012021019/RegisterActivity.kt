package com.example.madpractical3_20012021019

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.madpractical3_20012021019.databinding.ActivityMainBinding
import com.example.madpractical3_20012021019.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
    }
}