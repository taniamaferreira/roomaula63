package com.example.roomaula63.data.api

data class CivilizationResponse (
    val civilizations: List<CivilizationApiModel>

        )

data class CivilizationApiModel(
    val id: Int,
    val name: String

)
