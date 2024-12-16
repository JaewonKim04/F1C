package com.kong.result.repository

import com.kong.result.model.LastSessionResultSummary
import com.kong.result.model.SessionResult

interface ResultRepository {

    suspend fun getSessionResult(season: Int, round: Int): SessionResult

    suspend fun getSessionAnalyzes(season: Int, round: Int): List<String>

    suspend fun getLastSessionSummary(): LastSessionResultSummary
}