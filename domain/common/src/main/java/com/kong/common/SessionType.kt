package com.kong.common

enum class SessionType(val displayName: String) {

    RACE("Race"),
    SPRINT("Sprint"),
    SPRINT_QUALIFYING("Sprint Qualifying"),
    QUALIFYING("Qualifying"),
    PRACTICE("Practice")
}

fun String?.toModel() =
    SessionType.entries.find { it.name.equals(this, ignoreCase = true) } ?: SessionType.RACE