package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counterBtn: Button = findViewById(R.id.counterBtn)
        val counterText: TextView = findViewById(R.id.counter)
        var counter = 0

        counterBtn.setOnClickListener {
            counter++
            counterText.text = counter.toString()
        }
    }
}