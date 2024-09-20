package com.kong.home.repository

import com.kong.common.Session
import com.kong.common.fake.FakeSession
import com.kong.common.toModel
import com.kong.home.datasource.ResultRemoteDataSource
import com.kong.result.model.DriverResult
import com.kong.result.model.LastRaceResultSummary
import com.kong.result.model.fake.FakeDriverResult
import com.kong.result.repository.ResultRepository
import javax.inject.Inject

class ResultRepositoryImpl @Inject constructor(
    private val resultRemoteDataSource: ResultRemoteDataSource
) : ResultRepository {

    override suspend fun getSessionByKey(key: String): Session = FakeSession.getFakeSession()

    override suspend fun getDriverResults(key: String): List<DriverResult> =
        FakeDriverResult.getFakeDriverResults()

    override suspend fun getLastRaceSummary(): LastRaceResultSummary {
        val latestSession = resultRemoteDataSource.getLatestSession()
        val driverPositions =
            resultRemoteDataSource.getDriverPositions(latestSession.sessionKey ?: 0)

        return LastRaceResultSummary(
            raceName = "${latestSession.countryName} Grand Prix",
            sessionType = latestSession.sessionType.toModel(),
            firstThreeDriverResultList = driverPositions.map { it.toModel() }.take(3)
        )
    }
}