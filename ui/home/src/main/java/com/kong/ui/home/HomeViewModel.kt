package com.kong.ui.home

import androidx.lifecycle.ViewModel
import com.kong.result.usecase.GetLastSessionResultSummaryUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.Container
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getLastSessionResultSummaryUseCase: GetLastSessionResultSummaryUseCase
) : ViewModel(), ContainerHost<HomeState, HomeSideEffect> {

    override val container: Container<HomeState, HomeSideEffect> = container(HomeState())

    fun start() {
        getLastRaceResultSummary()
    }

    private fun getLastRaceResultSummary() = intent {
        reduce { state.copy(isLoading = true) }
        val raceResult = getLastSessionResultSummaryUseCase()
        reduce {
            state.copy(
                lastSessionResultSummary = raceResult,
                isLoading = false
            )
        }
    }

    fun onClickLastRaceResult() = intent {
        postSideEffect(
            HomeSideEffect.StartRaceResult(state.lastSessionResultSummary?.sessionKey ?: 0)
        )
    }
}