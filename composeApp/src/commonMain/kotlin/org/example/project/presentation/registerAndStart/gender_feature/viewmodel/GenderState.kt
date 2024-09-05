package org.example.project.presentation.registerAndStart.gender_feature.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color

data class GenderState(
    var colorMan:MutableState<Color> = mutableStateOf(Color.LightGray),
    var colorWoman:MutableState<Color> = mutableStateOf(Color.LightGray)
)
