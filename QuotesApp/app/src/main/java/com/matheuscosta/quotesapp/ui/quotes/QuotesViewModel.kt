package com.matheuscosta.quotesapp.ui.quotes

import androidx.lifecycle.ViewModel
import com.matheuscosta.quotesapp.data.Quote
import com.matheuscosta.quotesapp.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository): ViewModel() {
    fun getQuotes() = quoteRepository.getQuote()

    fun addQuotes(quote: Quote) = quoteRepository.addQuote(quote)
}