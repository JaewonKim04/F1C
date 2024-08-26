package com.kong.ui.result

import androidx.lifecycle.ViewModel
import com.kong.result.usecase.GetDriverResultsUseCase
import com.kong.result.usecase.GetSessionByKeyUseCase
import com.kong.ui.result.components.ResultType
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.Container
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

@HiltViewModel
class RaceResultViewModel @Inject constructor(
    private val getSessionByKeyUseCase: GetSessionByKeyUseCase,
    private val getDriverResultsUseCase: GetDriverResultsUseCase
) : ViewModel(),
    ContainerHost<RaceResultState, RaceResultSideEffect> {

    override val container: Container<RaceResultState, RaceResultSideEffect> =
        container(RaceResultState())

    fun start(key: String) {
        getSessionByKey(key)
        getDriverResultsByKey(key)
    }

    private fun getSessionByKey(key: String) = intent {
        val session = getSessionByKeyUseCase(key)
        reduce {
            state.copy(session = session)
        }
    }

    private fun getDriverResultsByKey(key: String) = intent {
        val driverResults = getDriverResultsUseCase(key)
        reduce {
            state.copy(driverResults = driverResults)
        }
    }

    fun onClickResultTypeTab(resultType: ResultType) = intent {
        reduce { state.copy(selectedResultType = resultType) }
    }
}