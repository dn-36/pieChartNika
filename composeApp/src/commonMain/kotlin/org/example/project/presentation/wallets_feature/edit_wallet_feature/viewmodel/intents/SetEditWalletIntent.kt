package org.example.project.presentation.wallets_feature.edit_wallet_feature.viewmodel.intents

import androidx.compose.runtime.mutableStateOf
import org.example.project.core.StaticDate
import org.example.project.presentation.wallets_feature.edit_wallet_feature.viewmodel.EditWalletViewModel
import piechart.composeapp.generated.resources.Res
import piechart.composeapp.generated.resources.circle
import piechart.composeapp.generated.resources.clicked_circle
import piechart.composeapp.generated.resources.eight_currency
import piechart.composeapp.generated.resources.fife_currency
import piechart.composeapp.generated.resources.four_currency
import piechart.composeapp.generated.resources.nine_currency
import piechart.composeapp.generated.resources.one_currency
import piechart.composeapp.generated.resources.seven_currency
import piechart.composeapp.generated.resources.six_currency
import piechart.composeapp.generated.resources.three_currency
import piechart.composeapp.generated.resources.two_currency

object SetEditWalletIntent {
    fun execute() {
        if (EditWalletViewModel(StaticDate).date.isUsedEditWallet.value) {
            EditWalletViewModel(StaticDate).date.isUsedEditWallet.value = false
            val newList = mutableListOf(
                Res.drawable.circle, Res.drawable.circle,
                Res.drawable.circle, Res.drawable.circle, Res.drawable.circle, Res.drawable.circle,
                Res.drawable.circle, Res.drawable.circle, Res.drawable.circle,
            )
            when (EditWalletViewModel(StaticDate).date.listWallets[EditWalletViewModel(StaticDate).date.indexDetailWallet.value].currency) {
                Res.drawable.one_currency -> {
                    newList[0] = Res.drawable.clicked_circle
                }

                Res.drawable.two_currency -> {
                    newList[1] = Res.drawable.clicked_circle
                }

                Res.drawable.three_currency -> {
                    newList[2] = Res.drawable.clicked_circle
                }

                Res.drawable.four_currency -> {
                    newList[3] = Res.drawable.clicked_circle
                }

                Res.drawable.fife_currency -> {
                    newList[4] = Res.drawable.clicked_circle
                }

                Res.drawable.six_currency -> {
                    newList[5] = Res.drawable.clicked_circle
                }

                Res.drawable.seven_currency -> {
                    newList[6] = Res.drawable.clicked_circle
                }

                Res.drawable.eight_currency -> {
                    newList[7] = Res.drawable.clicked_circle
                }

                Res.drawable.nine_currency -> {
                    newList[8] = Res.drawable.clicked_circle
                }
            }
            EditWalletViewModel.editWalletState = EditWalletViewModel.editWalletState.copy(
                currency = mutableStateOf(
                    EditWalletViewModel(StaticDate).date.listWallets[EditWalletViewModel(
                        StaticDate
                    ).date.indexDetailWallet.value].currency
                ),
                listCurrency = newList
            )
        }
    }
}