package com.example.examenalliedglobal.framework.datasource.joke

import com.example.examenalliedglobal.data.joke.datasource.JokeDataSource
import com.example.examenalliedglobal.domain.model.joke.Joke
import com.example.examenalliedglobal.framework.networking.JokeApi

class JokeRemoteDataSourceImpl(private val jokeApi: JokeApi): JokeDataSource {

    override suspend fun getJoke(): Result<Joke> {
        return try {
            val result = jokeApi.getJoke()
            Result.success(result)
        } catch (e: Exception) {
            Result.failure(Throwable("Handle Error"))
        }
    }
}
