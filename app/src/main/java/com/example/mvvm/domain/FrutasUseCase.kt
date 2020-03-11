package com.example.mvvm.domain

import com.example.mvvm.data.FrutasDataSet
import com.example.mvvm.ui.modelo.Frutas

class FrutasUseCase {
    private val frutasDataSet = FrutasDataSet()

    fun obtenerListaDeFrutas():List<Frutas>{
        return frutasDataSet.crearListaDeFrutas()
    }
}