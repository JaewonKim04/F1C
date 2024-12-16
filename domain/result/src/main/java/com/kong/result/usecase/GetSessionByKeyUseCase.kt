package com.kong.result.usecase

import com.kong.domain.core.ResResult
import com.kong.domain.core.wrapAsResult
import com.kong.result.model.SessionResult
import com.kong.result.repository.ResultRepository
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