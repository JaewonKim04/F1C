package com.kong.home.api

import com.kong.home.dto.driver.DriverResultResponse
import com.kong.home.dto.F1CServerResponse
import com.kong.home.dto.LatestSessionResponse
import com.kong.home.dto.session.SessionResultResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ResultApi {

    @GET("schedules/latest/finished")
    suspend fun getLatestSession(): F1CServerResponse<LatestSessionResponse>

    @GET("results/{SEASON}/{ROUND}/rankings")
    suspend fun getSession(
        @Path("SEASON") season: Int,
        @Path("ROUND") round: Int
    ): F1CServerResponse<SessionResultResponse>

    @GET("summaries/sessions/{sessionKey}") // TODO API 확인
    suspend fun getSessionSummaries(
        @Path("SEASON") season: Int,
        @Path("ROUND") round: Int
    ): F1CServerResponse<List<String>>
}