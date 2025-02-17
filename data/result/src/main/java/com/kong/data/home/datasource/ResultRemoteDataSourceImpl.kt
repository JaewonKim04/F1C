package com.kong.data.home.datasource

import com.kong.data.home.api.ResultApi
import com.kong.data.home.dto.LatestSessionResponse
import com.kong.data.home.dto.driver.FastestDriverResponse
import com.kong.data.home.dto.session.SessionResultResponse
import javax.inject.Inject

class ResultRemoteDataSourceImpl @Inject constructor(
    private val resultApi: ResultApi
) : ResultRemoteDataSource {

    override suspend fun getLatestSession(): LatestSessionResponse =
        resultApi.getLatestSession().data

    override suspend fun getSession(season: Int, round: Int): SessionResultResponse =
        resultApi.getSession(season = season, round = round).data

    override suspend fun getSessionSummaries(season: Int, round: Int): List<String> =
        resultApi.getSessionSummaries(season = season, round = round).data

    override suspend fun getFastestDrivers(season: Int, round: Int): List<FastestDriverResponse> =
        resultApi.getFastestDrivers(season = season, round = round).data
}