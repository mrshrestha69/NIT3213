package com.example.finalassignment.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.finalassignment.api.ApiClient
import com.example.finalassignment.api.ApiService
import com.example.finalassignment.models.LoginRequest
import com.example.finalassignment.models.LoginResponse
import com.example.finalassignment.R
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Call
import javax.inject.Inject

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {

    @Inject
    lateinit var apiService: ApiService


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val usernameInput = findViewById<EditText>(R.id.username_field)
        val passwordInput = findViewById<EditText>(R.id.password_field)
        val loginButton = findViewById<Button>(R.id.login_button)

////        Initialize Retrofit
//        val retrofit = ApiClient.getRetrofitInstance()
//        val apiService = retrofit.create(ApiService::class.java)

        loginButton.setOnClickListener{
            val username = usernameInput.text.toString().trim()
            val password = passwordInput.text.toString().trim()

            //Create login request object
            val loginRequest = LoginRequest(username, password)

            //Make the POST request for login
            apiService.userLogin(loginRequest).enqueue(object : Callback<LoginResponse> {
                override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                    if (response.isSuccessful) {
                        val loginResponse = response.body()
                        loginResponse?.let {
                            // Store keypass for future use and navigate to the next screen
                            val keypass = it.keypass
                            // You can now save this keypass in shared preferences or pass it to another activity
                            // For example: move to dashboard or show a success message
                            val intent = Intent(this@LoginActivity, DashboardActivity::class.java)
                            intent.putExtra("KEYPASS", keypass)
                            startActivity(intent)
                            finish()

                        }
                    } else {
                        // Handle failed response
                        val errorMessage = response.message() ?: "Unknown error"
                        Toast.makeText(this@LoginActivity, "Error: $errorMessage", Toast.LENGTH_SHORT).show()

                        // Safely log the message
                        Log.d("TAG", "onResponse: $errorMessage")
                    }
                }

                override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                    // Handle network failure
                    Toast.makeText(this@LoginActivity, "Network error: ${t.message}", Toast.LENGTH_SHORT).show()
                }
            })
        }
    }


}