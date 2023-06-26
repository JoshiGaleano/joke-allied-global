package com.example.examenalliedglobal.data.joke.datasource

import com.example.examenalliedglobal.domain.model.joke.Joke

interface JokeDataSource {

    suspend fun getJoke(): Result<Joke>
}