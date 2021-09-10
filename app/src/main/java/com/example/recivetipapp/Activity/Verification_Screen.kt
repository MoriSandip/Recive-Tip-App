package com.example.recivetipapp.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.recivetipapp.R

class Verification_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification_screen)
        Handler().postDelayed({
            val intent = Intent(this, DashboardScreen::class.java)
            startActivity(intent)

        }, 3000)

    }
}