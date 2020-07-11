package com.acme.androidmvvmparc.data



class QuoteRespository  private constructor(private  val quoteDao: FakeQuoteDao){

    fun addQuote(quote: Quote){
        quoteDao.addQuote(quote)

    }
    fun getQoutes() = quoteDao.getQoutes()



    companion object{
        @Volatile private var instance:QuoteRespository? = null
        fun instance(quoteDao: FakeQuoteDao) =
            instance ?: synchronized(lock = this){
                instance ?: QuoteRespository(quoteDao).also {
                    instance = it
                }
            }

    }




}