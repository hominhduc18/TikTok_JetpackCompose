package com.example.myapplication.repository

import com.example.myapplication.R
import javax.inject.Inject

class videoRepository @Inject constructor() {

    private val videos = listOf(
        R.raw.test,
        R.raw.test3,
        R.raw.test4
    )

    fun getVideo() = videos.random()
}


