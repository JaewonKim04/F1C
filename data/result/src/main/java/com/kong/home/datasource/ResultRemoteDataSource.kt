package com.kong.home.datasource

import com.kong.home.dto.LatestSessionResponse

interface ResultRemoteDataSource {

    suspend fun getLatestSession(): LatestSessionResponse
}