package com.acme.androidmvvmparc.data

data class Quote(val qoutetext:String,
                 val author:String) {

    override fun toString(): String {
        return "$qoutetext - $author"
    }


}