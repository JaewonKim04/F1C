package com.kongkong.home.repository

import com.kongkong.home.model.LastRaceResultSummary
import com.kongkong.home.model.fake.FakeLastRaceResultSummary
import javax.inject.Inject

class HomeRepositoryImpl @Inject constructor() : HomeRepository {

    override suspend fun getLastRaceSummary(): LastRaceResultSummary {
        return FakeLastRaceResultSummary.getLastRaceResultSummary()
    }
}