package org.example.project.presentation.wallets_feature.detail_wallet_feature.viewmodel.intents

import androidx.compose.runtime.mutableStateOf
import org.example.project.core.StaticDate
import org.example.project.presentation.menu_feature.utils.getCurrentMonth
import org.example.project.presentation.menu_feature.utils.getCurrentYear
import org.example.project.presentation.menu_feature.utils.getTodayDay
import org.example.project.presentation.wallets_feature.detail_wallet_feature.screen.DetailWalletsScreen
import org.example.project.presentation.wallets_feature.detail_wallet_feature.viewmodel.DetailWalletViewModel
import org.example.project.presentation.wallets_feature.edit_wallet_feature.screen.EditWalletScreen
import org.example.project.presentation.wallets_feature.list_wallets_feature.screen.ListWalletsScreen
import org.example.project.utils.SumWallet
import piechart.composeapp.generated.resources.Res
import piechart.composeapp.generated.resources.income_arrow_blue
import piechart.composeapp.generated.resources.income_arrow_orange

object DoneIntent {
    fun execute(sum:String){
        if(sum.length != 0) {
            var newSum = 0
            if (DetailWalletViewModel.detailWalletState.textAddOrSubtract.value == "Top up your balance") {
                newSum = DetailWalletViewModel(StaticDate).date.listWallets[DetailWalletViewModel(
                    StaticDate
                ).date.indexDetailWallet.value].sum.toInt()
                newSum += sum.toInt()

                DetailWalletViewModel(StaticDate).date.listWallets[DetailWalletViewModel(StaticDate).date.indexDetailWallet.value].listTransactions.add(
                    SumWallet(Res.drawable.income_arrow_blue, type = "Add",date = "${getCurrentMonth()} ${getTodayDay()}, ${getCurrentYear()}",sum = "+${sum}")
                )
            } else {
                newSum = DetailWalletViewModel(StaticDate).date.listWallets[DetailWalletViewModel(
                    StaticDate
                ).date.indexDetailWallet.value].sum.toInt()
                newSum -= sum.toInt()

                DetailWalletViewModel(StaticDate).date.listWallets[DetailWalletViewModel(StaticDate).date.indexDetailWallet.value].listTransactions.add(
                    SumWallet(Res.drawable.income_arrow_orange, type = "Subtract",date = "${getCurrentMonth()} ${getTodayDay()}, ${getCurrentYear()}",sum = "-${sum}")
                )
            }
            DetailWalletViewModel(StaticDate).date.listWallets[DetailWalletViewModel(StaticDate).date.indexDetailWallet.value].sum =
                newSum.toString()
            DetailWalletViewModel.detailWalletState = DetailWalletViewModel.detailWalletState.copy(
                alpha = mutableStateOf(0f)
            )
        }
        else{
            DetailWalletViewModel.detailWalletState = DetailWalletViewModel.detailWalletState.copy(
                alpha = mutableStateOf(0f)
            )
        }
    }
}