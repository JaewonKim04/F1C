package com.kong.feature.calendar

import androidx.lifecycle.ViewModel
import com.kong.domain.calendar.usecase.GetSessionsByYearMonthUseCase
import com.kong.domain.core.onSuccess
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.Container
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

@HiltViewModel
class CalendarViewModel @Inject constructor(
    private val getSessionsByYearMonthUseCase: GetSessionsByYearMonthUseCase
) : ViewModel(),
    ContainerHost<CalendarState, CalendarSideEffect> {

    override val container: Container<CalendarState, CalendarSideEffect> =
        container(CalendarState())

    init {
        getSessionsByYearMonth()
    }

    fun onClickNextMonth() = intent {
        reduce { state.copy(showingYearMonth = state.showingYearMonth.plusMonths(1)) }
        getSessionsByYearMonth()
    }

    fun onClickBeforeMonth() = intent {
        reduce { state.copy(showingYearMonth = state.showingYearMonth.minusMonths(1)) }
        getSessionsByYearMonth()
    }

    private fun getSessionsByYearMonth() = intent {
        getSessionsByYearMonthUseCase(state.showingYearMonth).onSuccess {
            reduce { state.copy(localDateAndSessions = it) }
        }
    }
}