package com.example.deliveryapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    private var editTextValue1: String = ""
    private var editTextValue2: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val editText1: EditText = findViewById(R.id.rf01tffw7uu)
        editText1.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // before Text Changed
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                editTextValue1 = s.toString()  // on Text Changed
            }

            override fun afterTextChanged(s: Editable?) {
                // after Text Changed
            }
        })

        val editText2: EditText = findViewById(R.id.rm6oc9gx8luo)
        editText2.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // before Text Changed
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                editTextValue2 = s.toString()  // on Text Changed
            }

            override fun afterTextChanged(s: Editable?) {
                // after Text Changed
            }
        })

        val button1: View = findViewById(R.id.r16rotuu1w09)
        button1.setOnClickListener {
            println("Pressed")
            // Start HomeActivity
            val intent = Intent(this@LoginActivity, HomeActivity::class.java)
            startActivity(intent)
            // optional: finish the login activity so the user can't go back to it
            finish()
        }
    }
}