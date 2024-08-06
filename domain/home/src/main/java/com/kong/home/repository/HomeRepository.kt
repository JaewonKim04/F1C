package com.kong.home.repository

import com.kong.home.model.LastRaceResultSummary

interface HomeRepository {

    suspend fun getLastRaceSummary(): LastRaceResultSummary
}