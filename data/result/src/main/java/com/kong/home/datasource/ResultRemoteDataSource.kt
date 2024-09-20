package com.kong.home.datasource

import com.kong.home.dto.DriverResultResponse
import com.kong.home.dto.LatestSessionResponse

interface ResultRemoteDataSource {

    suspend fun getLatestSession(): LatestSessionResponse

    suspend fun getDriverPositions(sessionKey: Long): List<DriverResultResponse>
}