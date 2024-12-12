package com.kong.home.repository

import com.kong.common.Session
import com.kong.common.fake.FakeSession
import com.kong.common.toSessionType
import com.kong.home.datasource.ResultRemoteDataSource
import com.kong.result.model.DriverResult
import com.kong.result.model.LastSessionResultSummary
import com.kong.result.repository.ResultRepository
import java.time.LocalDateTime
import javax.inject.Inject

class ResultRepositoryImpl @Inject constructor(
    private val resultRemoteDataSource: ResultRemoteDataSource
) : ResultRepository {

    override suspend fun getSessionResult(season: Int, round: Int): Session {
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
            sessionType = latestSession.raceType.toSessionType(),
            firstThreeDriverResultList = driverPositions.map { it.toModel().driver }.take(3)
        )
    }
}