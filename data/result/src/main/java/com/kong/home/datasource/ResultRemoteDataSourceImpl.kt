package com.kong.home.datasource

import com.kong.home.api.ResultApi
import com.kong.home.dto.DriverResultResponse
import com.kong.home.dto.LatestSessionResponse
import com.kong.home.dto.SessionResponse
import javax.inject.Inject

class ResultRemoteDataSourceImpl @Inject constructor(
    private val resultApi: ResultApi
) : ResultRemoteDataSource {

    override suspend fun getLatestSession(): LatestSessionResponse =
        resultApi.getLatestSession().data

    override suspend fun getSession(sessionKey: Long): SessionResponse =
        resultApi.getSession(sessionKey).data

    override suspend fun getDriverPositions(sessionKey: Long): List<DriverResultResponse> =
        resultApi.getDriverPositions(sessionKey).data

}