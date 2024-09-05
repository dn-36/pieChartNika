package org.example.project.presentation.registerAndStart.gender_feature.viewmodel.intents

import org.example.project.core.StaticDate
import org.example.project.presentation.registerAndStart.add_wallet_feature.screen.AddWalletScreen

object NextIntent {
    fun execute(){
        StaticDate.navigator.push(AddWalletScreen)
    }
}