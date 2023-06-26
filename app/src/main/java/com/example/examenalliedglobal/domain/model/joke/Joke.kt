package com.example.examenalliedglobal.domain.model.joke

import java.util.Date

data class Joke(
    val id: Int,
    val createDate: Date,
    val url: String,
    val updateDate: Date,
    val value: String,
    val iconUrl: String
)
