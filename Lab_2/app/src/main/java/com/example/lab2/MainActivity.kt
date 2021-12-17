package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var a : Int = 0
    fun onMyButtonClick(view: View) {
        val textView = findViewById<TextView>(R.id.textView) as TextView
        a += 1
        textView.setText(a.toString())
    }
}