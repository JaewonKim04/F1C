package com.kong.home.api

import com.kong.home.dto.LatestSessionResponse
import retrofit2.http.GET

interface ResultApi {

    @GET("sessions/latest")
    suspend fun getLatestSession(): LatestSessionResponse
}