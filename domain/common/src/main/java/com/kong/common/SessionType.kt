package com.kong.common

enum class SessionType(val displayName: String) {

    RACE("Race"),
    SPRINT("Sprint"),
    SPRINT_QUALIFYING("Sprint Qualifying"),
    QUALIFYING("Qualifying"),
    PRACTICE1("Practice1"),
    PRACTICE2("Practice2"),
    PRACTICE3("Practice3");

    companion object {
        fun getSessionTypeFromString(value: String?): SessionType =
            SessionType.entries.find { it.name.equals(value, ignoreCase = true) } ?: RACE
    }
}
