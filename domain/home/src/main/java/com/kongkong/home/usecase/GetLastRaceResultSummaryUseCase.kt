package com.kongkong.home.usecase

import com.kongkong.home.model.LastRaceResultSummary
import com.kongkong.home.repository.HomeRepository
import javax.inject.Inject

class GetLastRaceResultSummaryUseCase @Inject constructor(
    private val homeRepository: HomeRepository
) {

    operator suspend fun invoke(): LastRaceResultSummary = homeRepository.getLastRaceSummary()
}