package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.util.Patterns
import android.widget.TextView
import androidx.core.text.HtmlCompat
import com.google.android.material.textfield.TextInputLayout


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btnsignup : Button = findViewById<Button>(R.id.btnsignin)

        val txtemail : EditText = findViewById<EditText>(R.id.txtemail)
        val txtpassword : EditText = findViewById<EditText>(R.id.txtpassword)
        val txtemaillayout : TextInputLayout = findViewById<TextInputLayout>(R.id.txtInputEmail)
        val txtpasswordlayout : TextInputLayout= findViewById<TextInputLayout>(R.id.txtInputPassword)

        val signuplink           :TextView  = findViewById<TextView>(R.id.link_signup);





        signuplink.setOnClickListener {
            //*************************************************
            // when user clicks link, go to Sign UP Screen
            //*************************************************
            val intentSignUp : Intent = Intent(this@LoginActivity,SignUpActivity::class.java)
            startActivity(intentSignUp)
        }

        btnsignup.setOnClickListener()
        {

            //***************************
            // validate Email
            //  1.- Required
            //  2.- Valid email
            //***************************
             val email =  txtemail.text.toString().trim();

             if (email.isEmpty())
             {
                 txtemaillayout.error = "Email is required"
                 return@setOnClickListener
             }
            else
                 txtemaillayout.error=null;

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches())
            {
                txtemaillayout.error = "Enter valid email"
                return@setOnClickListener
            }
            else
                txtemaillayout.error=null;


            //***************************
            // validate Password
            //***************************

            val  password = txtpassword.text.toString().trim();

            if (password.isEmpty())
            {
                txtpasswordlayout.error = "Password is required"
                return@setOnClickListener
            }

            //***************************
            // Go to Login Ok  Screen
            //***************************
             val intentsignup : Intent = Intent( this@LoginActivity,LoginOK::class.java);
             startActivity(intentsignup);
        }

    }
}