package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


        private lateinit var musicaudio: ImageView




class MusicSelection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_music_selection)


        musicaudio  = findViewById(R.id.BeMyLover)
        musicaudio.setOnClickListener {
            val intent = Intent(this, MusicPlayer::class.java)
            startActivity(intent)
        }

    }
}