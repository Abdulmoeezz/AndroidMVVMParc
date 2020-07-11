package com.acme.androidmvvmparc.ui.quotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.acme.androidmvvmparc.R
import com.acme.androidmvvmparc.data.Quote
import com.acme.androidmvvmparc.utilities.InjectorUtiils
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        InitializeUI()
    }

   fun InitializeUI(){
    val factory = InjectorUtiils.provideQuotesViewModelfactory()
    val viewModel = ViewModelProviders.of(this,factory).get(MainViewModel::class.java)

   viewModel.getQuotes().observe(this, Observer { qoutes ->
       val stringBuilder = StringBuilder()
       qoutes.forEach{ quote ->
           stringBuilder.append("$quote\n\n")

       }
       textView_quotes.text = stringBuilder.toString()
   })

     button_add_quote.setOnClickListener{
         val quote = Quote(editText_quote.text.toString(),editText_author.text.toString())
         viewModel.addQuotes(quote)

     }


   }



}