package com.kong.home.api

import com.kong.home.dto.DriverResultResponse
import com.kong.home.dto.F1CServerResponse
import com.kong.home.dto.LatestSessionResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ResultApi {

    @GET("sessions/latest")
    suspend fun getLatestSession(): F1CServerResponse<LatestSessionResponse>

    @GET("positions/{sessionKey}/rankings")
    suspend fun getDriverPositions(
        @Path("sessionKey") sessionKey: Long
    ): F1CServerResponse<List<DriverResultResponse>>
}