package com.example.roomaula63.home.model.repository

import com.example.roomaula63.home.CivilizationModel

interface ICivilizationRepository {
    suspend fun obterLista(): List<CivilizationModel>
}