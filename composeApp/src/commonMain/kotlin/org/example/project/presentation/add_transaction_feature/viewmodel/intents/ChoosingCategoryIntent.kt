package org.example.project.presentation.add_transaction_feature.viewmodel.intents

import androidx.compose.ui.graphics.Color
import org.example.project.presentation.add_transaction_feature.viewmodel.AddTransactionViewModel
import org.example.project.presentation.registerAndStart.add_wallet_feature.viewmodel.AddWalletViewModel
import piechart.composeapp.generated.resources.Res
import piechart.composeapp.generated.resources.circle
import piechart.composeapp.generated.resources.clicked_circle

object ChoosingCategoryIntent {
   fun execute(index:Int){
      var newList = mutableListOf(
         Color.DarkGray, Color.DarkGray, Color.DarkGray,
         Color.DarkGray, Color.DarkGray, Color.DarkGray,
         Color.DarkGray, Color.DarkGray, Color.DarkGray,
         Color.DarkGray, Color.DarkGray, Color.DarkGray)

      newList[index] = Color.Yellow

      AddTransactionViewModel.addTransactionState = AddTransactionViewModel.addTransactionState.copy(
         listColors = newList
      )
   }
}