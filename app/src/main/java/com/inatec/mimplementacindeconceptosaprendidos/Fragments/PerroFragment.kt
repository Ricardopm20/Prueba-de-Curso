package com.carlosflores.ejercicio3.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.viewmodel.viewModelFactory
import com.inatec.implementacindeconceptosaprendidos.databinding.ListadeperrosBinding
import com.inatec.mimplementacindeconceptosaprendidos.Repositorio.repositorio1
import com.inatec.mimplementacindeconceptosaprendidos.appDataBase.BaseDatos
import com.inatec.mimplementacindeconceptosaprendidos.viewModel.MainViewModel
import com.inatec.mimplementacindeconceptosaprendidos.viewModel.ViewModelFactory

class PerroFragment : DialogFragment() {

    private var _binding : ListadeperrosBinding ? = null

    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModel: MainViewModel by activityViewModels {
            ViewModelFactory(repositorio1(BaseDatos.getDatabase(requireContext())))
       }

        //binding.textViewDato.text = viewModel.datoAPasar

        binding.BotonPerro.setOnClickListener {

            this.dismiss()

        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = ListadeperrosBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }

    companion object {

        @JvmStatic
        fun newInstance() = PerroFragment()
    }
}