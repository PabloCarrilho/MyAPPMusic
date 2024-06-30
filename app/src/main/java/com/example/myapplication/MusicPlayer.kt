package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

        private lateinit var backbutton: ImageView


class MusicPlayer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_music_player)

        backbutton = findViewById(R.id.ButtonBack)
        backbutton.setOnClickListener {
            val intent = Intent(this, MusicSelection::class.java)
            startActivity(intent)
        }


    }
}