package com.kong.result.usecase

import com.kong.domain.core.ResResult
import com.kong.domain.core.wrapAsResult
import com.kong.result.model.DriverResult
import com.kong.result.repository.ResultRepository
import javax.inject.Inject

class GetFastestDriverResultsUseCase @Inject constructor(
    private val resultRepository: ResultRepository
) {

    suspend operator fun invoke(season: Int, round: Int): ResResult<List<DriverResult>> =
        wrapAsResult {
            resultRepository.getFastestDrivers(season = season, round = round)
        }
}