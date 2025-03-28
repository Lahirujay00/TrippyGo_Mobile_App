package com.example.trippygoandroids

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.TimeZone

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val tripsIcon: ImageView = findViewById(R.id.tripsIcon)
        tripsIcon.setOnClickListener {
            val intent = Intent(this, Trips::class.java)
            startActivity(intent)
        }

        val savesIcon: ImageView = findViewById(R.id.savesIcon)
        savesIcon.setOnClickListener {
            val intent = Intent(this, collection::class.java)
            startActivity(intent)
        }

        val profileIcon: ImageView = findViewById(R.id.profileIcon)
        profileIcon.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }

        val jungleBeachCard: CardView = findViewById(R.id.jungleBeachCard)
        jungleBeachCard.setOnClickListener {
            val intent = Intent(this, location1::class.java)
            startActivity(intent)
        }

        val jungleBeachButton: Button = findViewById(R.id.jungleBeachButton)
        jungleBeachButton.setOnClickListener {
            val intent = Intent(this, location1::class.java)
            startActivity(intent)
        }

        val addTrip: CardView = findViewById(R.id.addTripCard)
        addTrip.setOnClickListener {
            val intent = Intent(this, newTrip::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}




