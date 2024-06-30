package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginTela : AppCompatActivity() {

        private lateinit var btLoginTela: ImageView
        private lateinit var btLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_tela)




    btLoginTela = findViewById(R.id.imageButton3)


    btLoginTela.setOnClickListener {
val intent = Intent(this, MainActivity::class.java)



    startActivity(intent)
    }

    btLogin = findViewById(R.id.button5)

    btLogin.setOnClickListener {
val intent = Intent(this, MusicSelection::class.java)

        startActivity(intent)
    }
}
}
