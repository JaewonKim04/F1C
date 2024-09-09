package com.kong.home.di

import com.kong.home.api.HomeApi
import com.kong.home.repository.HomeRepository
import com.kong.home.repository.HomeRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
abstract class HomeDataModule {

    @Binds
    abstract fun bindHomeRepository(repositoryImpl: HomeRepositoryImpl): HomeRepository

    @Singleton
    @Provides
    fun provideHomeApi(retrofit: Retrofit): HomeApi {
        return retrofit.create(HomeApi::class.java)
    }
}