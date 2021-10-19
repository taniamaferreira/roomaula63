package com.example.roomaula63.home.model.repository.api

import com.example.roomaula63.data.api.model.CivilizationEndpoint
import com.example.roomaula63.home.CivilizationModel
import com.example.roomaula63.home.model.repository.ICivilizationRepository

class CivilizationApiRepository: ICivilizationRepository {

    private val client = CivilizationEndpoint.endpoint

    override suspend fun obterLista(): List<CivilizationModel> {
       val result = client.obterListaDeCivilizacoes()

        return result.civilizations.map{
            CivilizationModel(it.id,it.name )
        }
    }
}