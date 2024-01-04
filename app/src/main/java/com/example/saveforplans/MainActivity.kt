package com.example.saveforplans

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickAddPlans(view: View) {

    }

    fun onClickViewExistingPlans(view: View) {

    }

    fun onClickBankAccountExpenses(view: View) {
        val intent = Intent(this, Savings_Spending::class.java)
        startActivity(intent)

    }
}
