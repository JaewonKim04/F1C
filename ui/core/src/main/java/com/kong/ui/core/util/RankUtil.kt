package com.kong.ui.core.util

object RankUtil {

    fun getRankText(rankIndex: Int): String {
        return when (rankIndex) {
            0 -> "1st"
            1 -> "2nd"
            2 -> "3rd"
            else -> "${rankIndex + 1}th"
        }
    }
}