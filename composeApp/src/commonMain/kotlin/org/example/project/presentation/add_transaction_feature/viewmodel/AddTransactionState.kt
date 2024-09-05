package org.example.project.presentation.add_transaction_feature.viewmodel

import androidx.compose.ui.graphics.Color

data class AddTransactionState(
    var listColors:MutableList<Color> = mutableListOf(Color.DarkGray,Color.DarkGray,Color.DarkGray,
        Color.DarkGray,Color.DarkGray,Color.DarkGray,
        Color.DarkGray,Color.DarkGray,Color.DarkGray,
        Color.DarkGray,Color.DarkGray,Color.DarkGray)
)
