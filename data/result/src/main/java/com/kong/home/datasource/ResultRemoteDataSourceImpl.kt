package com.kong.home.datasource

import com.kong.home.api.ResultApi
import com.kong.home.dto.LatestSessionResponse
import javax.inject.Inject

class ResultRemoteDataSourceImpl @Inject constructor(
    private val resultApi: ResultApi
) : ResultRemoteDataSource {

    override suspend fun getLatestSession(): LatestSessionResponse = resultApi.getLatestSession()
}