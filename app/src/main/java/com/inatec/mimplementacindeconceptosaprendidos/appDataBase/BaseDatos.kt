package com.inatec.mimplementacindeconceptosaprendidos.appDataBase

import android.content.Context
import androidx.annotation.ReturnThis
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.inatec.mimplementacindeconceptosaprendidos.DAOs.perroDao
import com.inatec.mimplementacindeconceptosaprendidos.Entities.Perro
import java.time.Instant

@Database(entities = [Perro::class], version = 1 )
abstract class BaseDatos: RoomDatabase() {
    abstract fun perroDao(): perroDao

    companion object{
        @Volatile
        private var INTANCE : BaseDatos? = null

        fun getDatabase(context : Context) : BaseDatos {
            return INTANCE ?: synchronized(this)  {
                Room.databaseBuilder(context.applicationContext,BaseDatos::class.java,"BaseDatos").build().also {
                    INTANCE=it
                }
            }
        }
    }
}