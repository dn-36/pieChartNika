package org.example.project.presentation.registerAndStart.start_feature.viewmodel.intents

import org.example.project.core.StaticDate
import org.example.project.presentation.registerAndStart.welcome_feature.screen.WelcomeScreen

object StartIntent {
    fun execute(){
        StaticDate.navigator.push(WelcomeScreen)
    }
}