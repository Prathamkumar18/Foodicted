package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        var login=findViewById<TextView>(R.id.Login)
        login.setOnClickListener {
            var intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}