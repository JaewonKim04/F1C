package com.kong.data.home.api

import com.kong.data.core.F1CServerResponse
import com.kong.data.home.dto.LatestSessionResponse
import com.kong.data.home.dto.driver.FastestDriverResponse
import com.kong.data.home.dto.session.SessionResultResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ResultApi {

    @GET("schedules/latest/finished")
    suspend fun getLatestSession(): F1CServerResponse<LatestSessionResponse>

    @GET("results/{SEASON}/{ROUND}/rankings")
    suspend fun getSession(
        @Path("SEASON") season: Int,
        @Path("ROUND") round: Int
    ): F1CServerResponse<SessionResultResponse>

    @GET("summaries/race/result")
    suspend fun getSessionSummaries(
        @Query("season") season: Int,
        @Query("round") round: Int
    ): F1CServerResponse<List<String>>

    @GET("results/{SEASON}/{ROUND}/fastest/3/laps")
    suspend fun getFastestDrivers(
        @Path("SEASON") season: Int,
        @Path("ROUND") round: Int
    ): F1CServerResponse<List<FastestDriverResponse>>
}