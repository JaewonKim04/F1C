package com.kong.domain.calendar.usecase

import com.kong.domain.common.Session
import com.kong.domain.calendar.repository.CalendarRepository
import com.kong.domain.core.ResResult
import com.kong.domain.core.wrapAsResult
import javax.inject.Inject

class GetNextSessionUseCase @Inject constructor(
    private val calendarRepository: CalendarRepository
) {

    suspend operator fun invoke(): ResResult<Session?> = wrapAsResult {
        calendarRepository.getNextSession()
    }
}