package com.kong.result.usecase

import com.kong.common.Session
import com.kong.result.repository.ResultRepository
import javax.inject.Inject

class GetSessionByKeyUseCase @Inject constructor(
    private val resultRepository: ResultRepository
) {

    suspend operator fun invoke(key: String): Session = resultRepository.getSessionByKey(key)
}