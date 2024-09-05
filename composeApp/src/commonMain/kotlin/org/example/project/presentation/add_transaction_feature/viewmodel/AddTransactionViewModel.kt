package org.example.project.presentation.add_transaction_feature.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import org.example.project.core.StaticDateApi
import org.example.project.presentation.add_transaction_feature.viewmodel.intents.ChoosingCategoryIntent

class AddTransactionViewModel(val date: StaticDateApi): ViewModel() {
    companion object{
        var addTransactionState by mutableStateOf(AddTransactionState())
    }
    fun processIntent(intents: AddTransactionIntents){
        when(intents){
            is AddTransactionIntents.ChoosingCategory -> {ChoosingCategoryIntent.execute(intents.index)}
        }
    }
}