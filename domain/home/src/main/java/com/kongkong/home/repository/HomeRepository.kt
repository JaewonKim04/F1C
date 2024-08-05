package com.kongkong.home.repository

import com.kongkong.home.model.LastRaceResultSummary

interface HomeRepository {

    suspend fun getLastRaceSummary(): LastRaceResultSummary
}