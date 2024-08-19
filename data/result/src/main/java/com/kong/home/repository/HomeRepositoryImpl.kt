package com.kong.home.repository

import com.kong.home.model.LastRaceResultSummary
import com.kong.home.model.fake.FakeLastRaceResultSummary
import javax.inject.Inject

class HomeRepositoryImpl @Inject constructor() : HomeRepository {

    override suspend fun getLastRaceSummary(): LastRaceResultSummary {
        return FakeLastRaceResultSummary.getLastRaceResultSummary()
    }
}