package com.kong.domain.result.usecase

import com.kong.domain.core.ResResult
import com.kong.domain.core.wrapAsResult
import com.kong.domain.result.model.LastSessionResultSummary
import com.kong.domain.result.repository.ResultRepository
import javax.inject.Inject

class GetLastSessionResultSummaryUseCase @Inject constructor(
    private val resultRepository: ResultRepository
) {

    suspend operator fun invoke(): ResResult<LastSessionResultSummary> = wrapAsResult {
        resultRepository.getLastSessionSummary()
    }
}