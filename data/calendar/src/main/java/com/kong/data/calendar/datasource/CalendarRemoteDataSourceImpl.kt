package com.kong.data.calendar.datasource

import com.kong.data.calendar.CalendarApi
import com.kong.data.calendar.dto.NextSessionResponse
import javax.inject.Inject

class CalendarRemoteDataSourceImpl @Inject constructor(
    private val calendarApi: CalendarApi
) : CalendarRemoteDataSource {

    override suspend fun getNextSession(): NextSessionResponse? = calendarApi.getNextSession().data
}