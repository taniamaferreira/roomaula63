package com.example.roomaula63.data.api.model

import com.example.roomaula63.data.api.ApiUtils
import com.example.roomaula63.data.api.CivilizationResponse
import retrofit2.http.GET

interface CivilizationEndpoint {
    @GET("civilizations")
    suspend fun obterListaDeCivilizacoes(): CivilizationResponse

    companion object{
        val endpoint: CivilizationEndpoint by lazy{
            ApiUtils.getRetrofitInstance().create(CivilizationEndpoint::class.java)
        }
    }
}