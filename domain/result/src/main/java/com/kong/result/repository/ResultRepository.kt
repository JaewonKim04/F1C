package com.kong.result.repository

import com.kong.common.Session

interface ResultRepository {

    suspend fun getSessionByKey(key: String): Session
}