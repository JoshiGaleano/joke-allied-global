package com.example.examenalliedglobal.domain.repository.joke

import com.example.examenalliedglobal.domain.model.joke.Joke

interface JokeRepository {

    suspend fun getJoke(): Result<Joke>
}