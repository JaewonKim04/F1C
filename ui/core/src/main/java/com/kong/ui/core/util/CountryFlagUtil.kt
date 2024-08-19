package com.kong.ui.core.util

object CountryFlagUtil {

    fun getFlagEmoji(countryCode: String?): String? {

        if (countryCode == null) return null

        val firstLetter = Character.codePointAt(countryCode, 0) - 0x41 + 0x1F1E6
        val secondLetter = Character.codePointAt(countryCode, 1) - 0x41 + 0x1F1E6
        return String(Character.toChars(firstLetter)) + String(Character.toChars(secondLetter))
    }
}