package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class SignUpOkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_ok)

        val btnok  : Button = findViewById<Button>(R.id.btnoksign_login)


        btnok.setOnClickListener()
        {
            val intentlogin : Intent = Intent (this@SignUpOkActivity,LoginActivity::class.java)
            //*********************************
            // Return to LOGIN SCREEN
            //*********************************
            startActivity(intentlogin)

        }
    }
}