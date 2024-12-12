package com.kong.domain.core

sealed class ResResult<out T> {

    data class Success<out T>(val data: T) : ResResult<T>()
    data class Error(val exception: Exception) : ResResult<Nothing>()
}

suspend fun <T> wrapAsResult(block: suspend () -> T): ResResult<T> {
    return try {
        ResResult.Success(block())
    } catch (e: Exception) {
        ResResult.Error(e)
    }
}

inline fun <T> ResResult<T>.onSuccess(
    onResult: (T) -> Unit
): ResResult<T> {
    if (this is ResResult.Success) {
        onResult(this.data)
    }

    return this
}

inline fun <T> ResResult<T>.onError(
    onResult: (Exception) -> Unit
): ResResult<T> {
    if (this is ResResult.Error) {
        onResult(this.exception)
    }

    return this
}

inline fun <T> ResResult<T>.onComplete(
    onResult: () -> Unit
): ResResult<T> {
    onResult()

    return this
}
