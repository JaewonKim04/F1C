package com.kong.result.usecase

import com.kong.result.repository.ResultRepository
import javax.inject.Inject

class GetSessionSummariesUseCase @Inject constructor(
    private val resultRepository: ResultRepository
) {

    suspend operator fun invoke(sessionKey: Long): List<String> =
        resultRepository.getSessionSummaries(sessionKey)
}