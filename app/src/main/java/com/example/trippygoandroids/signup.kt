package com.example.trippygoandroids

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)

        // Sign up button - navigates to home screen
        val signUpButton: Button = findViewById(R.id.button4)
        signUpButton.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
            finish() // Close the current activity
        }

        // Google sign up button
        val googleSignUpButton: Button = findViewById(R.id.button5)
        googleSignUpButton.setOnClickListener {
            // For now, also navigate to home screen
            val intent = Intent(this, home::class.java)
            startActivity(intent)
            finish()
        }

        // Sign in text - navigates to signin screen
        val signInTextView: TextView = findViewById(R.id.textView12)
        signInTextView.setOnClickListener {
            val intent = Intent(this, signin::class.java)
            startActivity(intent)
            finish() // Close the current activity
        }

        // Handle window insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}