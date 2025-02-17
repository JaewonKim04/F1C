package com.kong.data.calendar.di

import com.kong.data.calendar.api.CalendarApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import retrofit2.Retrofit

@Module
@InstallIn(ViewModelComponent::class)
object CalendarApiModule {

    @Provides
    @ViewModelScoped
    fun provideCalendarApi(retrofit: Retrofit): CalendarApi {
        return retrofit.create(CalendarApi::class.java)
    }
}