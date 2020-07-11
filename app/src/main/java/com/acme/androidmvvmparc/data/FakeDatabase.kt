package com.acme.androidmvvmparc.data

class FakeDatabase private  constructor(){

    var quoteDao = FakeQuoteDao()
        private  set



    companion object{
        @Volatile private var instance:FakeDatabase? = null
        fun instance() =
            instance ?: synchronized(lock = this){
                instance ?: FakeDatabase().also {
                                instance = it
                }
            }

    }
}