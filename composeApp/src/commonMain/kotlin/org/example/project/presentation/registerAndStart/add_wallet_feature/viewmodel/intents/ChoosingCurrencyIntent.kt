package org.example.project.presentation.registerAndStart.add_wallet_feature.viewmodel.intents

import org.example.project.presentation.registerAndStart.add_wallet_feature.viewmodel.AddWalletViewModel
import piechart.composeapp.generated.resources.Res
import piechart.composeapp.generated.resources.circle
import piechart.composeapp.generated.resources.clicked_circle

object ChoosingCurrencyIntent {
    fun execute(index:Int){

       var newList = mutableListOf(Res.drawable.circle,Res.drawable.circle,Res.drawable.circle,
            Res.drawable.circle,Res.drawable.circle,Res.drawable.circle,
            Res.drawable.circle,Res.drawable.circle,Res.drawable.circle,)

        newList[index] = Res.drawable.clicked_circle

        AddWalletViewModel.addWalletState = AddWalletViewModel.addWalletState.copy(
            listCurrency = newList
        )
    }
}