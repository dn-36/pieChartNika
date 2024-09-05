package org.example.project.presentation.registerAndStart.gender_feature.viewmodel.intents

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import org.example.project.presentation.registerAndStart.gender_feature.viewmodel.GenderViewModel

object ChoosingWomanIntent {
    fun execute(){
        if(GenderViewModel.genderState.colorWoman.value == Color.LightGray) {
            GenderViewModel.genderState = GenderViewModel.genderState.copy(
                colorWoman = mutableStateOf(Color.Yellow),
                colorMan = mutableStateOf(Color.LightGray)
            )
        }
        else{
            GenderViewModel.genderState = GenderViewModel.genderState.copy(
                colorWoman = mutableStateOf(Color.LightGray)
            )
        }
    }
}