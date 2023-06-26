package com.example.examenalliedglobal.domain.usecase

import com.example.examenalliedglobal.domain.model.joke.Joke

interface JokeUseCase {

    suspend fun getJokes(): Result<Joke>
}