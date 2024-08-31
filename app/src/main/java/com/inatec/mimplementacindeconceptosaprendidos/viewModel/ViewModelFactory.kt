package com.inatec.mimplementacindeconceptosaprendidos.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.inatec.mimplementacindeconceptosaprendidos.Repositorio.repositorio1

class ViewModelFactory(private val repo : repositorio1) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(repo) as T
        }
        throw IllegalArgumentException("Clase de ViewModel desconocida")
    }
}
