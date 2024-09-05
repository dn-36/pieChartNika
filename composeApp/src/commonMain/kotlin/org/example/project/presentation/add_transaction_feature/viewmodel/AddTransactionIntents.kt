package org.example.project.presentation.add_transaction_feature.viewmodel

sealed class AddTransactionIntents {
    data class ChoosingCategory(val index:Int):AddTransactionIntents()
}