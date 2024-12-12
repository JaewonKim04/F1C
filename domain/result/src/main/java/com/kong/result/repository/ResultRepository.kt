package com.kong.result.repository

import com.kong.common.Session
import com.kong.result.model.LastSessionResultSummary

interface ResultRepository {

    suspend fun getSessionResult(season: Int, round: Int): Session

    suspend fun getSessionAnalyzes(season: Int, round: Int): List<String>

    suspend fun getLastSessionSummary(): LastSessionResultSummary
}