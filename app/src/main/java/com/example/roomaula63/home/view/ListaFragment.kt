package com.example.roomaula63.home.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.roomaula63.R
import com.example.roomaula63.home.CivilizationModel
import com.example.roomaula63.home.viewmodel.CivilizationViewModel


class ListaFragment : Fragment() {

    private var _View = view
    private lateinit var _listaAdapter: ItemAdapter
    private var _listaDeCivilizacoes = mutableListOf<CivilizationModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lista, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _View = view
        criarRecyclerView()

        val viewModel = ViewModelProvider( this)[CivilizationViewModel::class.java]

        viewModel.obterLista().observe(viewLifecycleOwner,{
            exibirResultados(it)
        })
    }

    private fun exibirResultados(lista : List<CivilizationModel>?) {
        lista?.let { _listaDeCivilizacoes.addAll(it) }
        _listaAdapter.notifyDataSetChanged()

    }

    private fun criarRecyclerView() {
        val lista = _View?.findViewById<RecyclerView>(R.id.lista)
        val manager: LinearLayoutManager = LinearLayoutManager(_View?.context)

        _listaDeCivilizacoes = mutableListOf<CivilizationModel>()
        _listaAdapter = ItemAdapter(_listaDeCivilizacoes)

        lista?.apply {
            setHasFixedSize(true)

            layoutManager = manager
            adapter = _listaAdapter
        }


    }
}


