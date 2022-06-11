package com.practical.rahul.network

import com.practical.rahul.model.request.LoginRequest
import com.practical.rahul.model.response.LoginResponse
import javax.inject.Inject

class ServiceImp @Inject constructor(private val apiService: ApiService) {
    suspend fun getLogin(loginRequest: LoginRequest): LoginResponse =apiService.getLogin(loginRequest)
}