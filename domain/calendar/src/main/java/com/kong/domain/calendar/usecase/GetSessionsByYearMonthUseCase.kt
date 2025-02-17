package com.kong.domain.calendar.usecase

import com.kong.domain.common.Session
import com.kong.domain.calendar.repository.CalendarRepository
import com.kong.domain.core.ResResult
import com.kong.domain.core.wrapAsResult
import java.time.LocalDate
import java.time.YearMonth
import javax.inject.Inject

class GetSessionsByYearMonthUseCase @Inject constructor(
    private val calendarRepository: CalendarRepository
) {

    suspend operator fun invoke(yearMonth: YearMonth): ResResult<Map<LocalDate, List<Session>>> =
        wrapAsResult {
            calendarRepository.getSessionsByYearMonth(yearMonth)
        }
}