package org.example.project.presentation.menu_feature.viewmodel

import org.example.project.core.StaticDate
import org.example.project.presentation.add_transaction_feature.screen.AddTransactionScreen
import org.example.project.presentation.registerAndStart.add_photo_feature.screen.AddPhotoScreen

object AddTransactionIntent {
    fun execute(){
        StaticDate.navigator.push(AddTransactionScreen)
    }
}