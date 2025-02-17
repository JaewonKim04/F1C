package com.kong.ui.result

import androidx.lifecycle.ViewModel
import com.kong.domain.core.onSuccess
import com.kong.domain.result.usecase.GetFastestDriverResultsUseCase
import com.kong.domain.result.usecase.GetSessionByKeyUseCase
import com.kong.domain.result.usecase.GetSessionSummariesUseCase
import com.kong.ui.result.components.ResultType
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.Container
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

@HiltViewModel
class SessionResultViewModel @Inject constructor(
    private val getSessionByKeyUseCase: GetSessionByKeyUseCase,
    private val getSessionSummariesUseCase: GetSessionSummariesUseCase,
    private val getFastestDriverResultsUseCase: GetFastestDriverResultsUseCase
) : ViewModel(),
    ContainerHost<SessionResultState, SessionResultSideEffect> {

    override val container: Container<SessionResultState, SessionResultSideEffect> =
        container(SessionResultState())

    fun start(season: Int, round: Int) {
        intent { reduce { state.copy(season = season, round = round) } }
        getSessionByKey()
        getSessionSummaries()
        getFastestLapDriverResults()
    }

    private fun getSessionByKey() = intent {
        getSessionByKeyUseCase(season = state.season, round = state.round).onSuccess {
            reduce { state.copy(sessionResult = it) }
        }
    }

    private fun getSessionSummaries() = intent {
        getSessionSummariesUseCase(season = state.season, round = state.round).onSuccess {
            reduce { state.copy(summaries = it) }
        }
    }

    private fun getFastestLapDriverResults() = intent {
        getFastestDriverResultsUseCase(season = state.season, round = state.round).onSuccess {
            reduce { state.copy(fastestLapDriverResults = it) }
        }
    }

    fun onClickResultTypeTab(resultType: ResultType) = intent {
        reduce { state.copy(selectedResultType = resultType) }
    }
}