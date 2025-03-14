package com.example.trippygoandroids

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class onboarding4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding4)

        val getStartedButton: Button = findViewById(R.id.button)
        getStartedButton.setOnClickListener {
            // Create an Intent to start the NextActivity
            val intent = Intent(this, onboarding5::class.java)
            startActivity(intent)
        }
        // Find the "Skip" TextView and set its click listener
        val skipTextView: TextView = findViewById(R.id.textView4)
        skipTextView.setOnClickListener {
            // Create an Intent to start the StartupScreen activity
            val intent = Intent(this, startupscreen::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
