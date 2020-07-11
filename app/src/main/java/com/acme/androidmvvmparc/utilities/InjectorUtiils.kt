package com.acme.androidmvvmparc.utilities

import com.acme.androidmvvmparc.data.FakeDatabase
import com.acme.androidmvvmparc.data.QuoteRespository
import com.acme.androidmvvmparc.ui.quotes.MainViewModelFactory

object InjectorUtiils {
    fun  provideQuotesViewModelfactory() : MainViewModelFactory {
        val quoteRespository =QuoteRespository.instance(FakeDatabase.instance().quoteDao)
        return MainViewModelFactory(quoteRespository)



    }







}