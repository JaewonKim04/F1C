package com.kong.home.datasource

import com.kong.home.dto.DriverResultResponse
import com.kong.home.dto.LatestSessionResponse
import com.kong.home.dto.SessionResponse

interface ResultRemoteDataSource {

    suspend fun getLatestSession(): LatestSessionResponse

    suspend fun getSession(sessionKey: Long): SessionResponse

    suspend fun getDriverPositions(sessionKey: Long): List<DriverResultResponse>

    suspend fun getSessionSummaries(sessionKey: Long): List<String>
}