package com.example.examenalliedglobal.data.joke.usecase

import com.example.examenalliedglobal.domain.model.joke.Joke
import com.example.examenalliedglobal.domain.repository.joke.JokeRepository
import com.example.examenalliedglobal.domain.usecase.JokeUseCase

class JokeUseCaseImpl(private val jokeRepository: JokeRepository): JokeUseCase {

    override suspend fun getJokes(): Result<Joke> = jokeRepository.getJoke()
}
