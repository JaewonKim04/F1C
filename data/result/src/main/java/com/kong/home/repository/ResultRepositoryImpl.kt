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

    override suspend fun getSession(sessionKey: Long): Session {
        return resultRemoteDataSource.getSession(sessionKey).toModel()
    }

    override suspend fun getDriverResults(sessionKey: Long): List<DriverResult> {
        return resultRemoteDataSource.getDriverPositions(2024, 1).map {
            DriverResult( // TODO driver result 값 확인
                driver = it.toDriver(),
                gapToLeader = 0f,
                interval = 0f,
                sessionTime = LocalDateTime.now()
            )
        }
    }

    override suspend fun getSessionSummaries(sessionKey: Long): List<String> {
        return resultRemoteDataSource.getSessionSummaries(sessionKey).take(3)
    }

    override suspend fun getLastSessionSummary(): LastSessionResultSummary {
        val latestSession = resultRemoteDataSource.getLatestSession()

        val season = latestSession.season ?: 0
        val round = latestSession.round ?: 0
        val driverPositions = resultRemoteDataSource.getDriverPositions(
            season = season,
            round = round
        )

        return LastSessionResultSummary(
            season = season,
            round = round,
            sessionName = latestSession.raceName.orEmpty(),
            sessionType = latestSession.raceType.toSessionType(),
            firstThreeDriverResultList = driverPositions.map { it.toDriver() }.take(3)
        )
    }
}