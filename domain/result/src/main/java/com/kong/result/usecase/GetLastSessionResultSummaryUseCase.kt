package com.kong.result.usecase

import com.kong.result.model.LastSessionResultSummary
import com.kong.result.repository.ResultRepository
import javax.inject.Inject

class GetLastSessionResultSummaryUseCase @Inject constructor(
    private val resultRepository: ResultRepository
) {

    suspend operator fun invoke(): LastSessionResultSummary =
        resultRepository.getLastRaceSummary()
}