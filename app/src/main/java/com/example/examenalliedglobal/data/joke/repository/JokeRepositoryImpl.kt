package com.example.examenalliedglobal.data.joke.repository

import com.example.examenalliedglobal.data.joke.datasource.JokeDataSource
import com.example.examenalliedglobal.domain.model.joke.Joke
import com.example.examenalliedglobal.domain.repository.joke.JokeRepository

class JokeRepositoryImpl(private val jokeDataSource: JokeDataSource) : JokeRepository {

    override suspend fun getJoke(): Result<Joke> = jokeDataSource.getJoke()
}
