package com.kong.ui.result

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.Container
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

@HiltViewModel
class RaceResultViewModel @Inject constructor() : ViewModel(),
    ContainerHost<RaceResultState, RaceResultSideEffect> {

    override val container: Container<RaceResultState, RaceResultSideEffect> =
        container(RaceResultState())
}