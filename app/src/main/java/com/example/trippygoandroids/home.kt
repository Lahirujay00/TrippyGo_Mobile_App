package com.example.trippygoandroids

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        // Find the "Trip" TextView and set its click listener
        val tripView: ImageView = findViewById(R.id.imageView13)
        tripView.setOnClickListener {
            // Create an Intent to start the StartupScreen activity
            val intent = Intent(this, Trips::class.java)
            startActivity(intent)
        }

        val lView: ImageView = findViewById(R.id.imageView100)
        lView.setOnClickListener {
            // Create an Intent to start the StartupScreen activity
            val intent = Intent(this, location1::class.java)
            startActivity(intent)
        }

        val locationView: CardView = findViewById(R.id.cardView22)
        locationView.setOnClickListener {
            // Create an Intent to start the StartupScreen activity
            val intent = Intent(this, location1::class.java)
            startActivity(intent)
        }

        val getStartedButton: Button = findViewById(R.id.button66)
        getStartedButton.setOnClickListener {
            // Create an Intent to start the location1 activity
            val intent = Intent(this, location1::class.java)
            startActivity(intent)
        }

        val cView: ImageView = findViewById(R.id.imageView14)
        cView.setOnClickListener {
            // Create an Intent to start the StartupScreen activity
            val intent = Intent(this, collection::class.java)
            startActivity(intent)
        }

        val hView: ImageView = findViewById(R.id.imageView15)
        hView.setOnClickListener {
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