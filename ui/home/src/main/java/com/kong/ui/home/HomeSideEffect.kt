package com.kong.ui.home

sealed class HomeSideEffect {

    data class StartSessionResult(val sessionKey: Long) : HomeSideEffect()
}