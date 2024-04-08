package com.example.loginpagetask

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginpagetask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            loginButton.setOnClickListener {
                startActivity(Intent(this@MainActivity, LoginActivity::class.java))
            }
            signupButton.setOnClickListener {
                startActivity(Intent(this@MainActivity, SignUpActivity::class.java))
            }
        }
    }
}