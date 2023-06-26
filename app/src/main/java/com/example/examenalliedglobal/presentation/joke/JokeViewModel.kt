package com.example.examenalliedglobal.presentation.joke

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.examenalliedglobal.domain.usecase.JokeUseCase
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.consumeAsFlow
import kotlinx.coroutines.launch

class JokeViewModel(private val useCase: JokeUseCase): ViewModel() {

    private val jokeIntent = Channel<JokeIntent>()
    private val _state = MutableStateFlow<JokeState>(JokeState.Idle)
    val state: StateFlow<JokeState> get() = _state

    init {
        handleIntents()
    }

    private fun handleIntents() {
        viewModelScope.launch {
            jokeIntent.consumeAsFlow().collect { intent ->
                when (intent) {
                    is JokeIntent.GetJoke -> getJoke()
                }
            }
        }
    }

    private suspend fun getJoke() {
        val response = useCase.getJokes()

        if (response.isSuccess) {
            response.onSuccess {
                _state.value = JokeState.Detail(it)
            }
        }
    }

}