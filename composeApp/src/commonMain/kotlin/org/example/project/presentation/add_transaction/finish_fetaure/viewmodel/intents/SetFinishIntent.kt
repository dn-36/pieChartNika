package org.example.project.presentation.add_transaction.finish_fetaure.viewmodel.intents

import androidx.compose.runtime.mutableStateOf
import org.example.project.presentation.add_transaction.utils.DataTransaction
import org.example.project.presentation.add_transaction.finish_fetaure.viewmodel.FinishViewModel
import org.example.project.utils.Transaction
import androidx.compose.ui.graphics.Color

object SetFinishIntent {
    fun execute(){
        val sign = if(DataTransaction.incomeOrExpense.value == "Expense")"-" else "+"
        val color = if(DataTransaction.incomeOrExpense.value == "Expense") Color.Red else Color(0xFFF8DB1C)
        FinishViewModel.finishState = FinishViewModel.finishState.copy(
            transaction = mutableStateOf(Transaction(img = DataTransaction.icon.value
            , category = DataTransaction.category.value, name = DataTransaction.name.value
            , month = DataTransaction.month.value,day = DataTransaction.day.value,
                year = DataTransaction.year.value, sum = DataTransaction.sum.value, sign = sign, color = color ))
        )
    }
}