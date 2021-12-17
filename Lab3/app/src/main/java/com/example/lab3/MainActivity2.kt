package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val textView2 = findViewById<TextView>(R.id.textView2) as TextView
        textView2.textSize = 20F
        textView2.setPadding(16,16,16,16)
        textView2.text = EXTRA_MESSAGE
    }

}