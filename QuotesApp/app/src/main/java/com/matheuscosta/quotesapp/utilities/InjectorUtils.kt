package com.matheuscosta.quotesapp.utilities

import com.matheuscosta.quotesapp.data.FakeDatabase
import com.matheuscosta.quotesapp.data.QuoteRepository
import com.matheuscosta.quotesapp.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}