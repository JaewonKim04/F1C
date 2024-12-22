package com.kong.data.calendar.datasource

import com.kong.data.calendar.CalendarApi
import com.kong.data.calendar.dto.CalendarSessionResponse
import com.kong.data.calendar.dto.NextSessionResponse
import java.time.YearMonth
import javax.inject.Inject

class CalendarRemoteDataSourceImpl @Inject constructor(
    private val calendarApi: CalendarApi
) : CalendarRemoteDataSource {

    override suspend fun getNextSession(): NextSessionResponse? = calendarApi.getNextSession().data

    override suspend fun getSessionsByYearMonth(yearMonth: YearMonth): List<CalendarSessionResponse> =
        calendarApi.getSessionsByYearMonth(year = yearMonth.year, month = yearMonth.monthValue).data
}