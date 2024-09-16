package com.example.myapplication

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val Tag = "MainActivity"
    lateinit var bat: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bat = findViewById(R.id.next)

        bat.setOnClickListener {

            val intent = Intent(this@MainActivity, Second::class.java)
            startActivity(intent)
        }
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show()


        Log.i(Tag, "onCreate: ")


    }


    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "Start", Toast.LENGTH_SHORT).show()
        Log.e(Tag, "onStart: ")

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"onResume", Toast.LENGTH_SHORT).show()
        Log.i(Tag, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"onPause", Toast.LENGTH_SHORT).show()
        Log.i(Tag, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"onStop", Toast.LENGTH_SHORT).show()
        Log.i(Tag, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"onDestroy", Toast.LENGTH_SHORT).show()
        Log.i(Tag, "onDestroy: ")
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"onRestart", Toast.LENGTH_SHORT).show()
        Log.i(Tag, "onRestart: ")
    }
}

