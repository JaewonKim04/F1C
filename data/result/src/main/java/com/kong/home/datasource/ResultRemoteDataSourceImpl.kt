package com.kong.home.datasource

import com.kong.home.api.ResultApi
import com.kong.home.dto.LatestSessionResponse
import com.kong.home.dto.session.SessionResultResponse
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
}