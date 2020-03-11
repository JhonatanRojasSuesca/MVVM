package com.example.mvvm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.mvvm.R
import com.example.mvvm.domain.FrutasUseCase
import com.example.mvvm.ui.modelo.Frutas
import com.example.mvvm.viewModel.MyViewModelFactory
import com.example.mvvm.viewModel.ViewModelFrutas
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: ViewModelFrutas

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViewModelAndObserve()
        btnCrearListaFrutas.setOnClickListener {
            viewModel.getListaFrutas()
        }
    }

    fun setupViewModelAndObserve() {
        viewModel = ViewModelProviders.of(this, MyViewModelFactory(FrutasUseCase()))
            .get(ViewModelFrutas::class.java)
        val frutasObserver = Observer<List<Frutas>> {

            for (fruta in it) {
                Log.d("Frutas:", fruta.nombreFruta)
            }

            for ((index, value) in it.withIndex()) {
                Log.d("Frutas $index:", value.nombreFruta)
            }
        }
        viewModel.getListaFrutasLiveData().observe(this, frutasObserver)
    }
}

