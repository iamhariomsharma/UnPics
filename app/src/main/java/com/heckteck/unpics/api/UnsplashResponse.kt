package com.heckteck.unpics.api

import com.heckteck.unpics.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)