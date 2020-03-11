package com.example.mvvm.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm.domain.FrutasUseCase

class MyViewModelFactory(val frutasUseCase: FrutasUseCase): ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(FrutasUseCase::class.java).newInstance(frutasUseCase)
    }
}