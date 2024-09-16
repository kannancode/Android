package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Second : AppCompatActivity() {
    lateinit var prev : Button
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second)

        prev = findViewById(R.id.prev)

        prev.setOnClickListener{

            val intent = Intent(this@Second,Third::class.java)
            startActivity(intent)
        }

    }
}