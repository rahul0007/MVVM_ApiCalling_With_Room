package com.practical.rahul.repository

import com.practical.rahul.model.request.LoginRequest
import com.practical.rahul.network.ApiService
import javax.inject.Inject


class Repository @Inject constructor(private val apiService: ApiService) {
    //    flow task on background
    suspend fun getLogin(loginRequest : LoginRequest)=apiService.getLogin(loginRequest)
}