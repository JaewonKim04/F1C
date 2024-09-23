package com.kong.ui.home

sealed class HomeSideEffect {

    data class StartRaceResult(val sessionKey: Long) : HomeSideEffect()
}