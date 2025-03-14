package com.example.trippygoandroids

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class collection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_collection)

        val hView: ImageView = findViewById(R.id.imageView18)
        hView.setOnClickListener {
            // Create an Intent to start the StartupScreen activity
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }

        val tView: ImageView = findViewById(R.id.imageView19)
        tView.setOnClickListener {
            // Create an Intent to start the StartupScreen activity
            val intent = Intent(this, Trips::class.java)
            startActivity(intent)
        }

        val pView: ImageView = findViewById(R.id.imageView21)
        pView.setOnClickListener {
            // Create an Intent to start the StartupScreen activity
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}