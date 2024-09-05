package org.example.project.presentation.registerAndStart.filling_name_feature.viwmodel.intents

import org.example.project.core.StaticDate
import org.example.project.presentation.registerAndStart.add_photo_feature.screen.AddPhotoScreen

object NextIntent {
    fun execute(){
        StaticDate.navigator.push(AddPhotoScreen)
    }
}