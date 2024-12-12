package com.kong.home.datasource

import com.kong.home.dto.LatestSessionResponse
import com.kong.home.dto.session.SessionResultResponse

interface ResultRemoteDataSource {

    suspend fun getLatestSession(): LatestSessionResponse

    suspend fun getSession(season: Int, round: Int): SessionResultResponse

    suspend fun getSessionSummaries(season: Int, round: Int): List<String>
}