package org.example.project.presentation.add_transaction_feature.viewmodel.intents

import org.example.project.core.StaticDate
import org.example.project.presentation.add_transaction_feature.screen.AddTransactionScreen
import org.example.project.presentation.menu_feature.screen.MenuScreen

object BackButtonIntent {
    fun execute(){
        StaticDate.navigator.push(MenuScreen)
    }
}