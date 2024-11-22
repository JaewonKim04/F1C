package com.kong.ui.home

sealed interface HomeSideEffect {

    data class StartSessionResult(val sessionKey: Long) : HomeSideEffect

    object StartCalendar : HomeSideEffect
}