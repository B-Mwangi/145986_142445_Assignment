package com.example.recipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler




class Introduction : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introduction)

        supportActionBar?.hide()

        @Suppress("DEPRECATION")
        Handler().postDelayed({
            val intent = Intent(this@Introduction, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}