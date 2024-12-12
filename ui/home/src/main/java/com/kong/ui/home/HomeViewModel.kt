package com.kong.ui.home

import androidx.lifecycle.ViewModel
import com.kong.domain.calendar.usecase.GetNextSessionUseCase
import com.kong.domain.core.onComplete
import com.kong.domain.core.onSuccess
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

        getLastSessionResultSummaryUseCase().onSuccess {
            reduce { state.copy(lastSessionResultSummary = it) }
        }.onComplete {
            reduce { state.copy(isLastSessionLoading = false) }
        }
    }

    private fun getNextSession() = intent {
        reduce { state.copy(isNextSessionLoading = true) }
        val nextSession = getNextSessionUseCase()
        reduce {
            state.copy(
                nextSession = nextSession,
                isNextSessionLoading = false
            )
        }
    }

    fun onClickLastSessionResult() = intent {
//        postSideEffect(
//            HomeSideEffect.StartSessionResult(state.lastSessionResultSummary?.sessionKey ?: 0)
//        )
    }

    fun onClickNextSession() = intent {
        postSideEffect(HomeSideEffect.StartCalendar)
    }
}