package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Third :AppCompatActivity()  {
    lateinit var bat : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third)
        bat = findViewById(R.id.thirdbtn)

        bat.setOnClickListener{

            val intent = Intent(this@Third,MainActivity::class.java)
            startActivity(intent)
        }

    }

}