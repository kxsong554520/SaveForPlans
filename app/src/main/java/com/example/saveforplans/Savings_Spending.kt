package com.example.saveforplans

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Savings_Spending : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.savings_spending)


        // Find the back button by its ID
        val backButton: Button = findViewById(R.id.btnBack)

        backButton.setOnClickListener {
            // Create an intent to go back to MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}
