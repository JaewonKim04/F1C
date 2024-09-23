package com.kong.navigate

enum class NavScreens(val route: String) {
    HOME("home"),
    RACE_RESULT("race_result/{sessionKey}")
}