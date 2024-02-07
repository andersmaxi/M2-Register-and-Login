package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonLogin : Button = findViewById<Button>(R.id.btnlogin)
        val buttonSignup : Button = findViewById<Button>(R.id.btnsignup)


        buttonLogin.setOnClickListener()
        {

          //***********************
          // Go to LOGIN Screen
          //************************
          val intentLogin : Intent = Intent(this@MainActivity,LoginActivity::class.java)
            startActivity(intentLogin)
        }

        buttonSignup.setOnClickListener()
        {
            //**************************
            // Got to SIGN UP Screen
            //**************************
            val intentSignUp : Intent = Intent(this@MainActivity,SignUpActivity::class.java)
            startActivity(intentSignUp)
        }
    }
}