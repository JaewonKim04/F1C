package com.kong.feature.home

sealed interface HomeSideEffect {

    data class StartSessionResult(val season: Int, val round: Int) : HomeSideEffect

    data object StartCalendar : HomeSideEffect
}