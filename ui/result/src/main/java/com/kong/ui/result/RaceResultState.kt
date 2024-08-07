package com.kong.ui.result

data class RaceResultState(

    val selectedResultType: SelectedResultType = SelectedResultType.RANK
) {

    enum class SelectedResultType {

        RANK,
        ANALYZE
    }
}
