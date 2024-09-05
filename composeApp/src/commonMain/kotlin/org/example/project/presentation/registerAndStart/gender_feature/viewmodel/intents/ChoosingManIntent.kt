package org.example.project.presentation.registerAndStart.gender_feature.viewmodel.intents

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import org.example.project.presentation.registerAndStart.gender_feature.viewmodel.GenderViewModel

object ChoosingManIntent {
    fun execute(){
        if(GenderViewModel.genderState.colorMan.value == Color.LightGray) {
            GenderViewModel.genderState = GenderViewModel.genderState.copy(
                colorMan = mutableStateOf(Color.Yellow),
                colorWoman = mutableStateOf(Color.LightGray)
            )
        }
        else{
            GenderViewModel.genderState = GenderViewModel.genderState.copy(
                colorMan = mutableStateOf(Color.LightGray)
            )
        }
    }
}