package com.kong.home.datasource

import com.kong.home.dto.LatestSessionResponse
import com.kong.home.dto.driver.FastestDriverResponse
import com.kong.home.dto.session.SessionResultResponse

interface ResultRemoteDataSource {

    suspend fun getLatestSession(): LatestSessionResponse

    suspend fun getSession(season: Int, round: Int): SessionResultResponse

    suspend fun getSessionSummaries(season: Int, round: Int): List<String>

    suspend fun getFastestDrivers(season: Int, round: Int): List<FastestDriverResponse>
}