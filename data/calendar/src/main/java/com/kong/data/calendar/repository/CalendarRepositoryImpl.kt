package com.kong.data.calendar.repository

import com.kong.common.Session
import com.kong.common.fake.FakeSession
import com.kong.data.calendar.datasource.CalendarRemoteDataSource
import com.kong.domain.calendar.repository.CalendarRepository
import javax.inject.Inject

class CalendarRepositoryImpl @Inject constructor(
    private val calendarRemoteDataSource: CalendarRemoteDataSource
) : CalendarRepository {

    override suspend fun getNextSession(): Session? =
        calendarRemoteDataSource.getNextSession()?.toModel()
}