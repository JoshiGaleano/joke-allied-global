package com.example.examenalliedglobal.presentation.joke

import com.example.examenalliedglobal.domain.model.joke.Joke

sealed class JokeState {

    object Idle: JokeState()
    object Loading: JokeState()
    data class Detail(val joke: Joke): JokeState()
    data class Error(val error: String): JokeState()
}