package com.kong.result.usecase

import com.kong.domain.core.ResResult
import com.kong.domain.core.wrapAsResult
import com.kong.result.model.LastSessionResultSummary
import com.kong.result.repository.ResultRepository
import javax.inject.Inject

class GetLastSessionResultSummaryUseCase @Inject constructor(
    private val resultRepository: ResultRepository
) {

    suspend operator fun invoke(): ResResult<LastSessionResultSummary> = wrapAsResult {
        resultRepository.getLastSessionSummary()
    }
}