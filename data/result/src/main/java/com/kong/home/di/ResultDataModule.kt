package com.kong.home.di

import com.kong.home.repository.ResultRepositoryImpl
import com.kong.result.repository.ResultRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class ResultDataModule {

    @Binds
    abstract fun bindResultRepository(repositoryImpl: ResultRepositoryImpl): ResultRepository
}