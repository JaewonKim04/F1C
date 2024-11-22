package com.kong.home.repository

import com.kong.common.Session
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

    override suspend fun getSession(sessionKey: Long): Session {
        return resultRemoteDataSource.getSession(sessionKey).toModel()
    }

    override suspend fun getDriverResults(sessionKey: Long): List<DriverResult> {
        return resultRemoteDataSource.getDriverPositions(sessionKey).map {
            DriverResult( // TODO driver result 값 확인
                driver = it.toDriver(),
                gapToLeader = 0f,
                interval = 0f,
                raceTime = LocalDateTime.now()
            )
        }
    }

    override suspend fun getSessionSummaries(sessionKey: Long): List<String> {
        return resultRemoteDataSource.getSessionSummaries(sessionKey).take(3)
    }

    override suspend fun getLastRaceSummary(): LastSessionResultSummary {
        val latestSession = resultRemoteDataSource.getLatestSession()
        val sessionKey = latestSession.sessionKey ?: 0

        val driverPositions = resultRemoteDataSource.getDriverPositions(sessionKey)

        return LastSessionResultSummary(
            sessionKey = sessionKey,
            raceName = "${latestSession.countryName} Grand Prix",
            sessionType = latestSession.sessionType.toSessionType(),
            firstThreeDriverResultList = driverPositions.map { it.toDriver() }.take(3)
        )
    }
}