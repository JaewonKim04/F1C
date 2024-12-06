package com.kong.ui.calendar

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.kong.ui.calendar.component.CalendarMonthView
import org.orbitmvi.orbit.compose.collectAsState

@Composable
fun CalendarScreen(
    viewModel: CalendarViewModel = hiltViewModel()
) {
    val state by viewModel.collectAsState()

    Scaffold(
        topBar = {

        }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            CalendarMonthView(
                state = state,
                showingYearMonth = state.showingYearMonth
            )
        }
    }
}
