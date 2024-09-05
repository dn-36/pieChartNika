package org.example.project.presentation.registerAndStart.add_wallet_feature.viewmodel.intents

import org.example.project.core.StaticDate
import org.example.project.presentation.menu_feature.screen.MenuScreen

object FinishIntent {
    fun execute(){
        StaticDate.navigator.push(MenuScreen)
    }
}