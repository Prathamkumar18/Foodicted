package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var signup=findViewById<TextView>(R.id.signup)
        signup.setOnClickListener {
            var intent= Intent(this,Registration::class.java)
            startActivity(intent)
        }
        var tvsignup=findViewById<TextView>(R.id.tvsignup)
        tvsignup.setOnClickListener {
            var intent= Intent(this,Registration::class.java)
            startActivity(intent)
        }
    }
}