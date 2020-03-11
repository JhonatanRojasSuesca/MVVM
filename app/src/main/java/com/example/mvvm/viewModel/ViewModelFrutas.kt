package com.example.mvvm.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm.domain.FrutasUseCase
import com.example.mvvm.ui.modelo.Frutas

class ViewModelFrutas(val frutasUseCase: FrutasUseCase): ViewModel() {
    private val listData = MutableLiveData<List<Frutas>>()

    fun setListData(listaFrutas:List<Frutas>){
        listData.value = listaFrutas
    }

    fun getListaFrutas(){
        setListData(frutasUseCase.obtenerListaDeFrutas())
    }

    fun getListaFrutasLiveData(): LiveData<List<Frutas>> {
        return listData
    }

}