package com.example.mvvm.data

import com.example.mvvm.ui.modelo.Frutas

class FrutasDataSet {

    fun crearListaDeFrutas(): List<Frutas> {
        return listOf(
            Frutas("Manzana", "Rojo", 4.5F, 250.3F),
            Frutas("Banana","Amarillo",5.60F,200F),
            Frutas("Uvas","Verde",10.50F,100.5F))
    }
}