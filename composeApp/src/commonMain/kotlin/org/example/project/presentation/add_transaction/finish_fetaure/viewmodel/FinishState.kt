package org.example.project.presentation.add_transaction.finish_fetaure.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import org.example.project.utils.Transaction
import piechart.composeapp.generated.resources.Res
import piechart.composeapp.generated.resources.circle

data class FinishState(
    var transaction:MutableState<Transaction> = mutableStateOf(Transaction(img = Res.drawable.circle,
        category = "",name = "",month = "" ,day = "" , year = "", sum = "" , sign = "" , Color.Red))
)
