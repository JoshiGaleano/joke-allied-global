package com.example.examenalliedglobal.presentation.joke

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun JokeScreen(viewModel: JokeViewModel = hiltViewModel()) {

    Column {
        JokeSection()
    }
}

@Composable
private fun JokeSection() {
    LazyColumn() {
        items() {

        }
    }
}
