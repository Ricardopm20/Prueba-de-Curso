package com.inatec.implementacindeconceptosaprendidos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.inatec.implementacindeconceptosaprendidos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var Bindin : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Bindin = ActivityMainBinding.inflate(layoutInflater)

        setContentView(Bindin.root)




    }
}