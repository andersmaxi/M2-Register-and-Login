package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginOK : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_ok)

        val btnok  : Button = findViewById<Button>(R.id.btnok_login)

        btnok.setOnClickListener()
        {
            // Return to Main SCREEN
            val IntentContinue : Intent = Intent(this@LoginOK,MainActivity::class.java)
            startActivity(IntentContinue)
        }
    }
}