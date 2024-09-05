package org.example.project.presentation.registerAndStart.add_wallet_feature.viewmodel

sealed class AddWalletIntents {
    data class ChoosingCurrency(val index:Int):AddWalletIntents()
    object Finish:AddWalletIntents()
}