package com.example.finalassignment.api

import com.example.finalassignment.models.DashboardResponse
import com.example.finalassignment.models.EntityDetails
import com.example.finalassignment.models.LoginRequest
import com.example.finalassignment.models.LoginResponse
import retrofit2.http.POST
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header

interface ApiService {
    //    Login endpoints
    @POST("/sydney/auth")
    fun userLogin(@Body loginRequest: LoginRequest): Call<LoginResponse>

    //    Dashboard endpoints
    @GET("/dashboard/courses")
    fun getEntities(): Call<DashboardResponse>
}