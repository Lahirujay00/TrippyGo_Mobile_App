package com.example.trippygoandroids

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class startupscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_startupscreen)

        val getStartedButton: Button = findViewById(R.id.button2)
        getStartedButton.setOnClickListener {
            // Create an Intent to start the NextActivity
            val intent = Intent(this, signin::class.java)
            startActivity(intent)
        }

        val signUpButton: Button = findViewById(R.id.button3)
        signUpButton.setOnClickListener {
            // Create an Intent to start the NextActivity
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}