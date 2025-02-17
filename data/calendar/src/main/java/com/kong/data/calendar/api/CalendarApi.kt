package com.kong.data.calendar.api

import com.kong.data.calendar.dto.CalendarSessionResponse
import com.kong.data.calendar.dto.NextSessionResponse
import com.kong.data.core.F1CServerResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface CalendarApi {

    @GET("schedules/latest")
    suspend fun getNextSession(): F1CServerResponse<NextSessionResponse?>

    @GET("schedules")
    suspend fun getSessionsByYearMonth(
        @Query("year") year: Int,
        @Query("month") month: Int
    ): F1CServerResponse<List<CalendarSessionResponse>>
}