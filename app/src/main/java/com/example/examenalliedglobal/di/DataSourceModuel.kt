package com.example.examenalliedglobal.di

import com.example.examenalliedglobal.data.joke.datasource.JokeDataSource
import com.example.examenalliedglobal.data.joke.repository.JokeRepositoryImpl
import com.example.examenalliedglobal.data.joke.usecase.JokeUseCaseImpl
import com.example.examenalliedglobal.domain.repository.joke.JokeRepository
import com.example.examenalliedglobal.domain.usecase.JokeUseCase
import com.example.examenalliedglobal.framework.datasource.joke.JokeRemoteDataSourceImpl
import com.example.examenalliedglobal.framework.networking.JokeApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn

@Module
@InstallIn
object DataSourceModuel {

    @Provides
    fun providesJokeUseCase(jokeRepository: JokeRepository): JokeUseCase {
        return JokeUseCaseImpl(jokeRepository)
    }

    @Provides
    fun providesJokeRepository(jokeDataSource: JokeDataSource): JokeRepository {
        return JokeRepositoryImpl(jokeDataSource)
    }

    @Provides
    fun provideRemoteDataSource(jokeApi: JokeApi): JokeDataSource {
        return JokeRemoteDataSourceImpl(jokeApi)
    }
}