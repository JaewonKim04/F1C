package com.kong.navigate

enum class NavScreens(val route: String) {
    HOME("home"),
    SESSION_RESULT("session_result/{season}/{round}"),
    CALENDAR("calendar")
}