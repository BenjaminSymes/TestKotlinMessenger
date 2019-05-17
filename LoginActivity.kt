package com.example.kotlinmessenger

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        login_button_textview.setOnClickListener {
            val email = login_email_textview.text.toString()
            val password = login_password_textview.text.toString()

            Log.d("Login", "Attempt login with email and password: $email/***")

            FirebaseAuth.getInstance().signInWithEmailAndPassword(email,password)
             //   .addOnCompleteListener()

        }
        login_back_textview.setOnClickListener {
            finish()

        }
    }
}
