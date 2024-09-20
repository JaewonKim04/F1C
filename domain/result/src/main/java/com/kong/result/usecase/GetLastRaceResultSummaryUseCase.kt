package com.kong.result.usecase

import com.kong.result.repository.ResultRepository
import javax.inject.Inject

class GetLastRaceResultSummaryUseCase @Inject constructor(
    private val resultRepository: ResultRepository
) {

    suspend operator fun invoke(): com.kong.result.model.LastRaceResultSummary =
        resultRepository.getLastRaceSummary()
}