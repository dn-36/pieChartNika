package org.example.project.presentation.menu_feature.viewmodel

import androidx.lifecycle.ViewModel
import org.example.project.core.StaticDateApi

class MenuViewModel(val date: StaticDateApi): ViewModel() {
    fun processIntent(intents: MenuIntents){
        when(intents){
            is MenuIntents.AddTransaction -> {AddTransactionIntent.execute()}
        }
    }
}