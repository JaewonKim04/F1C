package com.kong.data.calendar.di

import com.kong.data.calendar.datasource.CalendarRemoteDataSource
import com.kong.data.calendar.datasource.CalendarRemoteDataSourceImpl
import com.kong.data.calendar.repository.CalendarRepositoryImpl
import com.kong.domain.calendar.repository.CalendarRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class CalendarDataModule {

    @Binds
    abstract fun bindCalendarRepository(repositoryImpl: CalendarRepositoryImpl): CalendarRepository

    @Binds
    abstract fun bindCalendarRemoteDataSource(
        dataSourceImpl: CalendarRemoteDataSourceImpl
    ): CalendarRemoteDataSource
}