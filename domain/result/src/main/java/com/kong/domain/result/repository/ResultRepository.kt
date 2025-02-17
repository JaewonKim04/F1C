package com.kong.domain.result.repository

import com.kong.domain.result.model.DriverResult
import com.kong.domain.result.model.LastSessionResultSummary
import com.kong.domain.result.model.SessionResult

interface ResultRepository {

    suspend fun getSessionResult(season: Int, round: Int): SessionResult

    suspend fun getSessionAnalyzes(season: Int, round: Int): List<String>

    suspend fun getLastSessionSummary(): LastSessionResultSummary

    suspend fun getFastestDrivers(season: Int, round: Int): List<DriverResult>
}