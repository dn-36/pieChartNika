package org.example.project.presentation.wallets_feature.edit_wallet_feature.viewmodel.intents

import androidx.compose.runtime.mutableStateOf
import org.example.project.core.StaticDate
import org.example.project.presentation.menu_feature.screen.MenuScreen
import org.example.project.presentation.menu_feature.utils.getCurrentMonth
import org.example.project.presentation.menu_feature.utils.getCurrentYear
import org.example.project.presentation.menu_feature.utils.getTodayDay
import org.example.project.presentation.registerAndStart.add_wallet_feature.viewmodel.AddWalletViewModel
import org.example.project.presentation.wallets_feature.detail_wallet_feature.screen.DetailWalletsScreen
import org.example.project.presentation.wallets_feature.edit_wallet_feature.viewmodel.EditWalletViewModel
import org.example.project.presentation.wallets_feature.list_wallets_feature.screen.ListWalletsScreen
import org.example.project.utils.SumWallet
import org.example.project.utils.Wallets
import piechart.composeapp.generated.resources.Res
import piechart.composeapp.generated.resources.income_arrow_blue

object DoneIntent {
    fun execute(name:String){
        if(name.length == 0){
            EditWalletViewModel.editWalletState = EditWalletViewModel.editWalletState.copy(
                toast = mutableStateOf(true)
            )
        }
        else {
            EditWalletViewModel(StaticDate).date.listWallets[EditWalletViewModel(StaticDate).date.indexDetailWallet.value].name = name
            EditWalletViewModel(StaticDate).date.listWallets[EditWalletViewModel(StaticDate).date.indexDetailWallet.value].currency = EditWalletViewModel.editWalletState.currency.value
            StaticDate.navigator.push(DetailWalletsScreen)
        }
    }
}