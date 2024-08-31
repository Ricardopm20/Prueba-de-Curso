package com.inatec.mimplementacindeconceptosaprendidos.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.inatec.mimplementacindeconceptosaprendidos.Entities.Perro
import com.inatec.mimplementacindeconceptosaprendidos.Repositorio.repositorio1
import kotlinx.coroutines.Dispatchers



class   MainViewModel(private val report: repositorio1 ) : ViewModel() {

    var datoAPasar = ""

    fun selectAllUsuarios() : LiveData<List<Perro>> {

        return report.selectAllDogs().asLiveData(Dispatchers.IO)

    }

/*    fun selectDog(id : Int) : LiveData<Perro> {

        return report.selectAllDogs(id).asLiveData(Dispatchers.IO)

    }*/

    fun selectUsuarioConPersona() : LiveData<List<Perro>> {

        return report.selectAllDogs().asLiveData(Dispatchers.IO)

    }

}