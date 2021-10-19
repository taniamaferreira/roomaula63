package com.example.roomaula63.home.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.roomaula63.home.model.repository.ICivilizationRepository
import com.example.roomaula63.home.model.repository.api.CivilizationApiRepository
import kotlinx.coroutines.Dispatchers

class CivilizationViewModel: ViewModel() {

    private val civilizationApiRepository : ICivilizationRepository

    init {
        civilizationApiRepository = CivilizationApiRepository()
    }

    fun obterLista() = liveData(Dispatchers.IO) {
        val result = civilizationApiRepository.obterLista()
        emit(result)
    }
}