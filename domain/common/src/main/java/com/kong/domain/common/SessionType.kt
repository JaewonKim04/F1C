package com.kong.domain.common

enum class SessionType(val displayName: String, val value: String) {

    RACE("Race", "Race"),
    SPRINT("Sprint", "Sprint"),
    SPRINT_QUALIFYING("Sprint Qualifying", "SprintQualifying"),
    QUALIFYING("Qualifying", "Qualifying"),
    PRACTICE1("Practice1", "FirstPractice"),
    PRACTICE2("Practice2", "SecondPractice"),
    PRACTICE3("Practice3", "ThirdPractice");

    companion object {
        fun getSessionTypeFromString(value: String?): SessionType =
            SessionType.entries.find { it.value.equals(value, ignoreCase = true) } ?: RACE
    }
}
