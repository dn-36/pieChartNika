package org.example.project.presentation.registerAndStart.filling_name_feature.viwmodel

import androidx.lifecycle.ViewModel
import org.example.project.core.StaticDateApi
import org.example.project.presentation.registerAndStart.filling_name_feature.viwmodel.intents.NextIntent

class FillingNameViewModel(val date: StaticDateApi): ViewModel() {
    fun processIntent(intents: FillingNameIntents){
        when(intents){
            is FillingNameIntents.Next -> {NextIntent.execute()}
        }
    }
}