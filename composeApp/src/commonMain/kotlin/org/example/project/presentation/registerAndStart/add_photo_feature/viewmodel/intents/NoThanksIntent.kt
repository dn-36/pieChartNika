package org.example.project.presentation.registerAndStart.add_photo_feature.viewmodel.intents

import org.example.project.core.StaticDate
import org.example.project.presentation.registerAndStart.gender_feature.screen.GenderScreen

object NoThanksIntent {
    fun execute(){
        StaticDate.navigator.push(GenderScreen)
    }
}