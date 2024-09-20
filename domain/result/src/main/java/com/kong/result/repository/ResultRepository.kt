package com.kong.result.repository

import com.kong.common.Session
import com.kong.result.model.DriverResult
import com.kong.result.model.LastRaceResultSummary

interface ResultRepository {

    suspend fun getSession(sessionKey: Long): Session

    suspend fun getDriverResults(sessionKey: Long): List<DriverResult>

    suspend fun getLastRaceSummary(): LastRaceResultSummary
}