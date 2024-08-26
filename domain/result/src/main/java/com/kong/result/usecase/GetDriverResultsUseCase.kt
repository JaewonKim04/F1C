package com.kong.result.usecase

import com.kong.result.repository.ResultRepository
import javax.inject.Inject

class GetDriverResultsUseCase @Inject constructor(
    private val resultRepository: ResultRepository
) {

    suspend operator fun invoke(key: String) = resultRepository.getDriverResults(key)
}