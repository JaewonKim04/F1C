package com.kong.data.calendar

import com.kong.data.calendar.dto.NextSessionResponse
import com.kong.data.core.F1CServerResponse
import retrofit2.http.GET

interface CalendarApi {

    @GET("schedules/latest")
    suspend fun getNextSession(): F1CServerResponse<NextSessionResponse?>
}