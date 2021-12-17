package com.example.lab4

import android.graphics.drawable.AnimationDrawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val img = findViewById<ImageView>(R.id.animationView) as ImageView
        img.setBackgroundResource(R.drawable.rabbit_animation)
        val frameAnimation = img.background as AnimationDrawable
        frameAnimation.isOneShot = false
        frameAnimation.start()
    }
}