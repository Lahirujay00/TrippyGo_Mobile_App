package com.example.trippygoandroids

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class alert : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_alert)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Delay for 3 seconds (3000 milliseconds) and then redirect to Trips activity
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Trips::class.java)
            startActivity(intent)
            finish() // Optional: Close the current activity to prevent going back to it
        }, 3000) // 3000 milliseconds = 3 seconds

    }
}