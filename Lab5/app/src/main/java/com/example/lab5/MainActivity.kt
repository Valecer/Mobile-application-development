package com.example.lab5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.net.Uri
import android.net.Uri.parse
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    val MyVideoPlayer = findViewById<VideoView>(R.id.videoView) as VideoView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val MyVideoPlayer = findViewById<VideoView>(R.id.videoView) as VideoView
        val mediaController = MediaController(this)
        mediaController.setAnchorView(MyVideoPlayer)
        val uri: Uri =
            parse("android.resource://" + packageName + "/" + R.raw.one)
        MyVideoPlayer.setMediaController(mediaController)
        MyVideoPlayer.setVideoURI(uri)
        MyVideoPlayer.requestFocus()
        MyVideoPlayer.start()
    }




//    fun onStartClick(view: View) {
//        MyVideoPlayer.start()
//    }
//    fun onPauseClick(view: View) {
//        MyVideoPlayer.pause()
//    }
//    fun onStopClick(view: View) {
//        MyVideoPlayer.stopPlayback()
//        MyVideoPlayer.resume()
//    }

}