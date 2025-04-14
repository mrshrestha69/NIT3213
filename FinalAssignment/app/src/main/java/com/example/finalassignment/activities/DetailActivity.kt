package com.example.finalassignment.activities


import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.finalassignment.R

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        //Getting values from my adapter
        val courseCode = intent.getStringExtra("courseCode")
        val courseName = intent.getStringExtra("courseTitle")
        val courseInstructor = intent.getStringExtra("courseInstructor")
        val courseCredit = intent.getStringExtra("courseCredit")
        val description = intent.getStringExtra("courseDescription")

        // Find views and set data
        val codeTextView: TextView = findViewById(R.id.tvCourseCode)
        val nameTextView: TextView = findViewById(R.id.tvCourseName)
        val instructorTextView: TextView = findViewById(R.id.tvInstructor)
        val creditTextView: TextView = findViewById(R.id.tvCredits)
        val descriptionTextView: TextView = findViewById(R.id.tvDescription)


        //Setting the values to their corresponding views
        codeTextView.text = courseCode
        nameTextView.text = courseName
        instructorTextView.text = courseInstructor
        creditTextView.text = courseCredit
        descriptionTextView.text = description

    }
}
