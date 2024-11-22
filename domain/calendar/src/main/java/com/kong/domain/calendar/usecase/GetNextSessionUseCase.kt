package com.kong.domain.calendar.usecase

import com.kong.common.Session
import com.kong.domain.calendar.repository.CalendarRepository
import javax.inject.Inject

class GetNextSessionUseCase @Inject constructor(
    private val calendarRepository: CalendarRepository
) {

    suspend operator fun invoke(): Session =
        calendarRepository.getNextSession()
}