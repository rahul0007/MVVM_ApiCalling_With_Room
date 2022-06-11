package com.practical.rahul.network
import com.practical.rahul.model.request.LoginRequest
import com.practical.rahul.model.response.LoginResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("api/BranchLogin")
    suspend fun getLogin(@Body loginRequest: LoginRequest): LoginResponse
}