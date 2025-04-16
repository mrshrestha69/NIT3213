package com.example.deliveryapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val homeIcon: ImageView = findViewById(R.id.r4uatdyh3r72)
        val profileIcon: ImageView = findViewById(R.id.rfrve8moyq0t)

        homeIcon.setOnClickListener {
            // No need to redirect, already on HomeActivity.
        }

        profileIcon.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}