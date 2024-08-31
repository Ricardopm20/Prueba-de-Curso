package com.inatec.mimplementacindeconceptosaprendidos.Repositorio

import com.inatec.mimplementacindeconceptosaprendidos.Entities.Perro
import com.inatec.mimplementacindeconceptosaprendidos.appDataBase.BaseDatos
import kotlinx.coroutines.flow.Flow

data class repositorio1(private val BD : BaseDatos){
    fun selectAllDogs():Flow<List<Perro>>{
        return BD.perroDao().SelectoTodosPerros()
    }
}

