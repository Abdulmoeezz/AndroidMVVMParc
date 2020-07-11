package com.acme.androidmvvmparc.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class FakeQuoteDao {
    private  val quotelist = mutableListOf<Quote>()
    private  val qoutes = MutableLiveData<List<Quote>>()


    init {
        qoutes.value = quotelist
    }

    fun addQuote(quote: Quote){
        quotelist.add(quote)
        qoutes.value = quotelist
    }
    fun getQoutes() = qoutes as LiveData<List<Quote>>


}