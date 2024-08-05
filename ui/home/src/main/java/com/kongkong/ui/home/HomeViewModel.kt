package com.kongkong.ui.home

import androidx.lifecycle.ViewModel
import com.kongkong.home.usecase.GetLastRaceResultSummaryUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.Container
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getLastRaceResultSummaryUseCase: GetLastRaceResultSummaryUseCase
) : ViewModel(), ContainerHost<HomeState, HomeSideEffect> {

    override val container: Container<HomeState, HomeSideEffect> = container(HomeState())

    fun start() {
        getLastRaceResultSummary()
    }

    private fun getLastRaceResultSummary() = intent {
        val raceResult = getLastRaceResultSummaryUseCase()
        reduce {
            state.copy(lastRaceResultSummary = raceResult)
        }
    }
}