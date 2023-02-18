package com.example.uiproject4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uiproject4.R
import android.content.Intent
import android.view.View
import android.widget.Button
import com.example.uiproject4.SignUpActivity
import com.example.uiproject4.LoginActivity

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        val signUp = findViewById<Button>(R.id.button)
        val login = findViewById<Button>(R.id.button2)
        val signIntent = Intent(this, SignUpActivity::class.java)
        val logIntent = Intent(this, LoginActivity::class.java)
        login.setOnClickListener { v: View? -> startActivity(logIntent) }
        signUp.setOnClickListener { v: View? -> startActivity(signIntent) }
    }
}