package com.kong.domain.result.usecase

import com.kong.domain.core.ResResult
import com.kong.domain.core.wrapAsResult
import com.kong.domain.result.repository.ResultRepository
import javax.inject.Inject

class GetSessionSummariesUseCase @Inject constructor(
    private val resultRepository: ResultRepository
) {

    suspend operator fun invoke(season: Int, round: Int): ResResult<List<String>> = wrapAsResult {
        resultRepository.getSessionAnalyzes(season = season, round = round)
    }
}