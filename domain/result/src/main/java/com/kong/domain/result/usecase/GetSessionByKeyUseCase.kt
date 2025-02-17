package com.kong.domain.result.usecase

import com.kong.domain.core.ResResult
import com.kong.domain.core.wrapAsResult
import com.kong.domain.result.model.SessionResult
import com.kong.domain.result.repository.ResultRepository
import javax.inject.Inject

class GetSessionByKeyUseCase @Inject constructor(
    private val resultRepository: ResultRepository
) {

    suspend operator fun invoke(season: Int, round: Int): ResResult<SessionResult> = wrapAsResult {
        resultRepository.getSessionResult(
            season = season,
            round = round
        )
    }
}