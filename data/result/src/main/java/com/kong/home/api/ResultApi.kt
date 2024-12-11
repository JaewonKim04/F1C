package com.kong.home.api

import com.kong.home.dto.DriverResultResponse
import com.kong.home.dto.F1CServerResponse
import com.kong.home.dto.LatestSessionResponse
import com.kong.home.dto.SessionResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ResultApi {

    @GET("schedules/latest/finished")
    suspend fun getLatestSession(): F1CServerResponse<LatestSessionResponse>

    @GET("sessions/{sessionKey}")
    suspend fun getSession(
        @Path("sessionKey") sessionKey: Long
    ): F1CServerResponse<SessionResponse>

    @GET("results/{SEASON}/{ROUND}/rankings")
    suspend fun getDriverPositions(
        @Path("SEASON") season: Int,
        @Path("ROUND") round: Int
    ): F1CServerResponse<List<DriverResultResponse>>

    @GET("summaries/sessions/{sessionKey}")
    suspend fun getSessionSummaries(
        @Path("sessionKey") sessionKey: Long
    ): F1CServerResponse<List<String>>
}