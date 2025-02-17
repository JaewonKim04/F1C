package com.kong.data.home.di

import com.kong.data.home.datasource.ResultRemoteDataSource
import com.kong.data.home.datasource.ResultRemoteDataSourceImpl
import com.kong.data.home.repository.ResultRepositoryImpl
import com.kong.domain.result.repository.ResultRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class ResultDataModule {

    @Binds
    abstract fun bindResultRepository(repositoryImpl: ResultRepositoryImpl): ResultRepository

    @Binds
    abstract fun bindResultRemoteDataSource(
        dataSourceImpl: ResultRemoteDataSourceImpl
    ): ResultRemoteDataSource
}