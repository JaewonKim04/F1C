package com.kong.result.repository

import com.kong.common.Session
import com.kong.result.model.DriverResult
import com.kong.result.model.LastRaceResultSummary

interface ResultRepository {

    suspend fun getSessionByKey(key: String): Session

    suspend fun getDriverResults(key: String): List<DriverResult>

    suspend fun getLastRaceSummary(): LastRaceResultSummary
}