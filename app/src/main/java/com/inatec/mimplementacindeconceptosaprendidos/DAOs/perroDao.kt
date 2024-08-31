package com.inatec.mimplementacindeconceptosaprendidos.DAOs

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.inatec.mimplementacindeconceptosaprendidos.Entities.Perro
import kotlinx.coroutines.flow.Flow

@Dao
interface perroDao {
    @Insert
    fun InsertarPerro(nombre: Perro)

    @Delete
    fun BorrarPerro(nombre: Perro)

    @Update
    fun ActulizarPerro(nombre: Perro)

    @Query("Select * from perro")
    fun SelectoTodosPerros(): Flow<List<Perro>>

}