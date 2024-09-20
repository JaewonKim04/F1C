package com.kong.home.di

import com.kong.home.api.ResultApi
import com.kong.home.datasource.ResultRemoteDataSource
import com.kong.home.datasource.ResultRemoteDataSourceImpl
import com.kong.home.repository.ResultRepositoryImpl
import com.kong.result.repository.ResultRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
abstract class ResultDataModule {

    @Binds
    abstract fun bindResultRepository(repositoryImpl: ResultRepositoryImpl): ResultRepository

    @Binds
    abstract fun bindResultRemoteDataSource(
        dataSourceImpl: ResultRemoteDataSourceImpl
    ): ResultRemoteDataSource

    @Singleton
    @Provides
    fun provideHomeApi(retrofit: Retrofit): ResultApi {
        return retrofit.create(ResultApi::class.java)
    }
}