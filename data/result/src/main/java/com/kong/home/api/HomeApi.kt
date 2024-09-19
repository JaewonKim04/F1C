package com.kong.home.api

import retrofit2.http.GET

interface HomeApi {

    @GET("sessions/latest")
    suspend fun getLatestSession()
}