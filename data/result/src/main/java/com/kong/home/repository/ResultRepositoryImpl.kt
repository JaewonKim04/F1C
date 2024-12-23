package com.kong.home.repository

import com.kong.common.SessionType
import com.kong.home.datasource.ResultRemoteDataSource
import com.kong.result.model.DriverResult
import com.kong.result.model.LastSessionResultSummary
import com.kong.result.model.SessionResult
import com.kong.result.repository.ResultRepository
import javax.inject.Inject

class ResultRepositoryImpl @Inject constructor(
    private val resultRemoteDataSource: ResultRemoteDataSource
) : ResultRepository {

    override suspend fun getSessionResult(season: Int, round: Int): SessionResult {
        return resultRemoteDataSource.getSession(season = season, round = round).toModel()
    }

    override suspend fun getSessionAnalyzes(season: Int, round: Int): List<String> {
        return resultRemoteDataSource.getSessionSummaries(season = season, round = round).take(3)
    }

    override suspend fun getLastSessionSummary(): LastSessionResultSummary {
        val latestSession = resultRemoteDataSource.getLatestSession()

        val season = latestSession.season ?: 0
        val round = latestSession.round ?: 0
        val driverPositions = resultRemoteDataSource.getSession(
            season = season,
            round = round
        ).drivers.orEmpty()

        return LastSessionResultSummary(
            season = season,
            round = round,
            sessionName = latestSession.raceName.orEmpty(),
            sessionType = SessionType.getSessionTypeFromString(latestSession.raceType),
            firstThreeDriverResultList = driverPositions.map { it.toModel() }.take(3)
        )
    }

    override suspend fun getFastestDrivers(season: Int, round: Int): List<DriverResult> =
        resultRemoteDataSource.getFastestDrivers(season = season, round = round)
            .map { it.toModel() }
}