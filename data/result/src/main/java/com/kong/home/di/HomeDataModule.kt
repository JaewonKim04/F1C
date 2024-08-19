package com.kong.home.di

import com.kong.home.repository.HomeRepository
import com.kong.home.repository.HomeRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class HomeDataModule {

    @Binds
    abstract fun bindHomeRepository(repositoryImpl: HomeRepositoryImpl): HomeRepository
}