package com.kong.ui.calendar

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.Container
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

@HiltViewModel
class CalendarViewModel @Inject constructor() : ViewModel(),
    ContainerHost<CalendarState, CalendarSideEffect> {

    override val container: Container<CalendarState, CalendarSideEffect> =
        container(CalendarState())


}