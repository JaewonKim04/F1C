package com.kong.home.repository

import com.kong.common.Session
import com.kong.common.fake.FakeSession
import com.kong.result.model.DriverResult
import com.kong.result.repository.ResultRepository
import javax.inject.Inject

class ResultRepositoryImpl @Inject constructor() : ResultRepository {

    override suspend fun getSessionByKey(key: String): Session = FakeSession.getFakeSession()

    override suspend fun getDriverResults(key: String): List<DriverResult> {
        TODO("Not yet implemented")
    }
}