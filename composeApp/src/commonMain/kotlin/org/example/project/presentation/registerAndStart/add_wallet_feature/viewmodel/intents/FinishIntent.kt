package org.example.project.presentation.registerAndStart.add_wallet_feature.viewmodel.intents

import androidx.compose.runtime.mutableStateOf
import org.example.project.core.StaticDate
import org.example.project.presentation.menu_feature.screen.MenuScreen
import org.example.project.presentation.menu_feature.utils.getCurrentMonth
import org.example.project.presentation.menu_feature.utils.getCurrentYear
import org.example.project.presentation.menu_feature.utils.getTodayDay
import org.example.project.presentation.registerAndStart.add_wallet_feature.viewmodel.AddWalletViewModel
import org.example.project.utils.SumWallet
import org.example.project.utils.Wallets
import piechart.composeapp.generated.resources.Res
import piechart.composeapp.generated.resources.income_arrow_blue
import piechart.composeapp.generated.resources.one_currency

object FinishIntent {
    fun execute(name:String,sum:String){
        if(name.length == 0 || sum.length == 0){
            AddWalletViewModel.addWalletState = AddWalletViewModel.addWalletState.copy(
                toast = mutableStateOf(true)
            )
        }
        else {
            AddWalletViewModel(StaticDate).date.listWallets.add(Wallets(sum = sum,name = name,
                currency = AddWalletViewModel.addWalletState.currency.value, listTransactionsIncome = mutableListOf()
                , listTransactionsExpense = mutableListOf(),mutableListOf(SumWallet(img = Res.drawable.income_arrow_blue
                , type = "Add", date = "${getCurrentMonth()} ${getTodayDay()}, ${getCurrentYear()}",sum = "+${sum}"))
            ))
            StaticDate.navigator.push(MenuScreen)
        }
    }
}