package com.example.examenalliedglobal.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetWorkModule {

    @Singleton
    @Provides
    @Named("BaseUrl")
    fun provideBaseUrl(): String = "https://api.chucknorris.io/"

    @Singleton
    @Provides
    fun providesRetrofit(@Named("BaseUrl") baseUrl: String): Retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    @Singleton
    @Provides
    fun providesChuckNorrisApi(retrofit: Retrofit):
}


