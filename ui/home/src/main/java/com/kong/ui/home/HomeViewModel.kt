package com.kong.ui.home

import androidx.lifecycle.ViewModel
import com.kong.domain.calendar.usecase.GetNextSessionUseCase
import com.kong.result.usecase.GetLastSessionResultSummaryUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.Container
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getLastSessionResultSummaryUseCase: GetLastSessionResultSummaryUseCase,
    private val getNextSessionUseCase: GetNextSessionUseCase
) : ViewModel(), ContainerHost<HomeState, HomeSideEffect> {

    override val container: Container<HomeState, HomeSideEffect> = container(HomeState())

    fun start() {
        getLastSessionResultSummary()
        getNextSession()
    }

    private fun getLastSessionResultSummary() = intent {
        reduce { state.copy(isLastSessionLoading = true) }
        val sessionResult = getLastSessionResultSummaryUseCase()
        reduce {
            state.copy(
                lastSessionResultSummary = sessionResult,
                isLastSessionLoading = false
            )
        }
    }

    private fun getNextSession() = intent {
        reduce { state.copy(isNextSessionLoading = true) }
        val nextSession = getNextSessionUseCase()
        reduce {
            state.copy(
                nextSession = nextSession,
                isLastSessionLoading = false
            )
        }
    }

    fun onClickLastRaceResult() = intent {
        postSideEffect(
            HomeSideEffect.StartRaceResult(state.lastSessionResultSummary?.sessionKey ?: 0)
        )
    }
}