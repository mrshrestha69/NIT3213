package com.example.deliveryapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val backIcon: ImageView = findViewById(R.id.rpfa7kfcs2x)
        val homeIcon: ImageView = findViewById(R.id.rvtrf543cx0e)

        backIcon.setOnClickListener {
            navigateToHome()
        }

        homeIcon.setOnClickListener {
            navigateToHome()
        }
    }

    private fun navigateToHome() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}