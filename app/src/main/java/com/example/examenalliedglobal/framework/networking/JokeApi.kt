package com.example.examenalliedglobal.framework.networking

import com.example.examenalliedglobal.domain.model.joke.Joke
import retrofit2.http.GET

interface JokeApi {

    @GET("jokes/random")
    suspend fun getJoke(): Joke
}
