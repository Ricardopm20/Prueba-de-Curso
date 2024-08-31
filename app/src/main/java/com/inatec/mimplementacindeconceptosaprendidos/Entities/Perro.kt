package com.inatec.mimplementacindeconceptosaprendidos.Entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Perro(
    @PrimaryKey(autoGenerate = true)
    var id: Int=0,
    @ColumnInfo(name = "nombre")
    var Nombre: String,
    @ColumnInfo(name = "raza")
    var Raza: String,
    @ColumnInfo(name = "edad")
    var Edad: Int,
    @ColumnInfo(name = "sexo")
    var Sexo: Boolean
)
