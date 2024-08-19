package com.kong.home.usecase

import com.kong.home.model.LastRaceResultSummary
import com.kong.home.repository.HomeRepository
import javax.inject.Inject

class GetLastRaceResultSummaryUseCase @Inject constructor(
    private val homeRepository: HomeRepository
) {

    suspend operator fun invoke(): LastRaceResultSummary = homeRepository.getLastRaceSummary()
}