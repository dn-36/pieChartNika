package org.example.project.presentation.registerAndStart.add_wallet_feature.viewmodel

import org.jetbrains.compose.resources.DrawableResource
import piechart.composeapp.generated.resources.Res
import piechart.composeapp.generated.resources.circle

data class AddWalletState(
    var listCurrency:MutableList<DrawableResource> = mutableListOf(Res.drawable.circle,Res.drawable.circle,
        Res.drawable.circle,Res.drawable.circle,Res.drawable.circle,Res.drawable.circle,
        Res.drawable.circle,Res.drawable.circle,Res.drawable.circle,)
)
