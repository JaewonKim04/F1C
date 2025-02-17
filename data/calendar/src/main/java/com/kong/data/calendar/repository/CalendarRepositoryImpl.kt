package com.kong.data.calendar.repository

import com.kong.domain.common.Session
import com.kong.data.calendar.datasource.CalendarRemoteDataSource
import com.kong.data.calendar.dto.toModel
import com.kong.domain.calendar.repository.CalendarRepository
import java.time.LocalDate
import java.time.YearMonth
import javax.inject.Inject

class CalendarRepositoryImpl @Inject constructor(
    private val calendarRemoteDataSource: CalendarRemoteDataSource
) : CalendarRepository {

    override suspend fun getNextSession(): Session? =
        calendarRemoteDataSource.getNextSession()?.toModel()

    override suspend fun getSessionsByYearMonth(yearMonth: YearMonth): Map<LocalDate, List<Session>> =
        calendarRemoteDataSource.getSessionsByYearMonth(yearMonth).toModel()
}