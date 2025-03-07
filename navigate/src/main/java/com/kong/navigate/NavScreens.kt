package com.kong.navigate

import kotlinx.serialization.Serializable

sealed interface NavScreens {
    @Serializable
    data object Home : NavScreens

    @Serializable
    data class SessionResult(val season: Int, val round: Int) : NavScreens

    @Serializable
    data object Calendar : NavScreens
}