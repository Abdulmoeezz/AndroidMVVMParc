package com.acme.androidmvvmparc.ui.quotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.acme.androidmvvmparc.data.QuoteRespository

class MainViewModelFactory(private  val quoteRespository: QuoteRespository):ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(quoteRespository) as T
    }
}