package com.inatec.mimplementacindeconceptosaprendidos.perroAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.inatec.implementacindeconceptosaprendidos.databinding.ListadeperrosBinding
import com.inatec.mimplementacindeconceptosaprendidos.DAOs.perroDao
import com.inatec.mimplementacindeconceptosaprendidos.Entities.Perro

class PerroAdaptaer(private var perros : ArrayList<Perro>): RecyclerView.Adapter<PerroAdaptaer.ViewHolderUsuario>() {

    inner class ViewHolderUsuario(val binding : ListadeperrosBinding  ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(perro: Perro) {

            binding.apply {

                idPerro.text = perro.id.toString()
                txtNombre.text= perro.Nombre
                txtRaza.text=perro.Raza
                txtEdad.text=perro.Edad.toString()
                txtSexo.text=perro.Sexo.toString()

              }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderUsuario {

        val binding = ListadeperrosBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolderUsuario(binding)

    }

    override fun onBindViewHolder(holder: ViewHolderUsuario, position: Int) {

        holder.bind(perros[position])

    }

    override fun getItemCount(): Int {

        return perros.size

    }

    fun updateUsuarios(nuevosUsuarios : ArrayList<Perro>) {

        perros = nuevosUsuarios
        this.notifyDataSetChanged()

    }


}