package com.kong.data.calendar.repository

import com.kong.common.Session
import com.kong.common.fake.FakeSession
import com.kong.domain.calendar.repository.CalendarRepository
import javax.inject.Inject

class CalendarRepositoryImpl @Inject constructor() : CalendarRepository {

    override suspend fun getNextSession(): Session = FakeSession.getFakeSession()
}