package com.example.simplebuttonlistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btKotlin: Button
    lateinit var btXMl: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btKotlin = findViewById(R.id.btKotlin)
        btXMl = findViewById(R.id.btXMl)

        btKotlin.setOnClickListener {
            Toast()
        }

    }

    private fun Toast() {
        Toast.makeText(applicationContext, "Toast message", Toast.LENGTH_LONG).show()
    }

    fun showToast(view: android.view.View) {
        Toast()
    }
}