package com.kong.home.di

import com.kong.home.api.ResultApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import retrofit2.Retrofit

@Module
@InstallIn(ViewModelComponent::class)
object ResultApiModule {

    @Provides
    @ViewModelScoped
    fun provideHomeApi(retrofit: Retrofit): ResultApi {
        return retrofit.create(ResultApi::class.java)
    }
}