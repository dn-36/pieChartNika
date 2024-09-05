package org.example.project.presentation.registerAndStart.add_photo_feature.viewmodel

import androidx.lifecycle.ViewModel
import org.example.project.core.StaticDateApi
import org.example.project.presentation.registerAndStart.add_photo_feature.viewmodel.intents.NoThanksIntent

class AddPhotoViewModel(val date: StaticDateApi): ViewModel() {
    fun processIntent(intents: AddPhotoIntents){
        when(intents){
            is AddPhotoIntents.NoThanks -> {NoThanksIntent.execute()}
        }
    }
}