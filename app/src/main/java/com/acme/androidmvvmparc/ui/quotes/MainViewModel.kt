package com.acme.androidmvvmparc.ui.quotes

import androidx.lifecycle.ViewModel
import com.acme.androidmvvmparc.data.Quote
import com.acme.androidmvvmparc.data.QuoteRespository

class MainViewModel(private  val quoteRespository: QuoteRespository):ViewModel() {

fun getQuotes() = quoteRespository.getQoutes()
fun addQuotes(quote: Quote) = quoteRespository.addQuote(quote)






}