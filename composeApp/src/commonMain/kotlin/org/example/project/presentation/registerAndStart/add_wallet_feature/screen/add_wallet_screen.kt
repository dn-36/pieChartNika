package org.example.project.presentation.registerAndStart.add_wallet_feature.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import org.example.project.core.StaticDate
import org.example.project.presentation.registerAndStart.add_wallet_feature.viewmodel.AddWalletIntents
import org.example.project.presentation.registerAndStart.add_wallet_feature.viewmodel.AddWalletViewModel
import org.jetbrains.compose.resources.painterResource
import piechart.composeapp.generated.resources.Res
import piechart.composeapp.generated.resources.back_button
import piechart.composeapp.generated.resources.eight_currency
import piechart.composeapp.generated.resources.fife_currency
import piechart.composeapp.generated.resources.finish_button
import piechart.composeapp.generated.resources.four_currency
import piechart.composeapp.generated.resources.nine_currency
import piechart.composeapp.generated.resources.one_currency
import piechart.composeapp.generated.resources.seven_currency
import piechart.composeapp.generated.resources.six_currency
import piechart.composeapp.generated.resources.three_currency
import piechart.composeapp.generated.resources.two_currency

object AddWalletScreen: Screen {
    var vm = AddWalletViewModel(StaticDate)
    @Composable
    override fun Content(){
        var nameWallet by remember { mutableStateOf("") }
        var startSum by remember { mutableStateOf("") }
        Box(modifier = Modifier.fillMaxSize()) {
            Column {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.1f)
                        .background(Color(0xFFF00001F)), contentAlignment = Alignment.CenterStart
                ) {
                    Row(modifier = Modifier.fillMaxWidth(0.7f)
                    , horizontalArrangement = Arrangement.SpaceAround) {
                        Image(painter = painterResource(Res.drawable.back_button), contentDescription = null,
                        modifier = Modifier.size(20.dp))

                        Text("Add Wallet", color = Color.White, fontSize = 20.sp
                            , fontWeight = FontWeight.Bold)
                    }
                }
                Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()
                    .background(Color.White), contentAlignment = Alignment.Center) {
                    Column(modifier = Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.SpaceAround
                        , horizontalAlignment = Alignment.CenterHorizontally) {
                        Text("Wallet name", color = Color.Black, fontSize = 25.sp)
                        Box(
                            modifier = Modifier.clip(RoundedCornerShape(10.dp))
                                .fillMaxWidth(0.7f).fillMaxHeight(0.1f)
                                .background(Color.DarkGray), contentAlignment = Alignment.Center
                        ) {
                            BasicTextField(
                                value = nameWallet,
                                onValueChange = { nameWallet = it },
                                textStyle = TextStyle(
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp
                                ),
                                modifier = Modifier
                                    .fillMaxWidth(0.9f)
                            )
                        }
                        Text("Start Sum", color = Color.Black, fontSize = 25.sp)

                        Box(
                            modifier = Modifier.clip(RoundedCornerShape(10.dp))
                                .fillMaxWidth(0.7f).fillMaxHeight(0.1f)
                                .background(Color.DarkGray), contentAlignment = Alignment.Center
                        ) {
                            BasicTextField(
                                value = startSum,
                                onValueChange = { startSum = it },
                                textStyle = TextStyle(
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp
                                ),
                                modifier = Modifier
                                    .fillMaxWidth(0.9f)
                            )
                        }

                        Text("Currency", color = Color.Black, fontSize = 25.sp)

                        LazyColumn {
                            itemsIndexed(
                                listOf(
                                    Res.drawable.one_currency, Res.drawable.two_currency,
                                    Res.drawable.three_currency, Res.drawable.four_currency,
                                    Res.drawable.fife_currency, Res.drawable.six_currency,
                                    Res.drawable.seven_currency, Res.drawable.eight_currency,
                                    Res.drawable.nine_currency
                                ).chunked(3)
                            ) { indexes, item ->
                                Row(
                                    modifier = Modifier
                                        .padding(top = 15.dp)
                                        .fillMaxWidth(0.5f),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    item.forEachIndexed { index, image ->
                                        val correctIndex = indexes * 3 + index // Правильная индексация
                                        Box(
                                            modifier = Modifier
                                                .size(50.dp)
                                                .clickable(
                                                    indication = null, // Отключение эффекта затемнения
                                                    interactionSource = remember { MutableInteractionSource() }
                                                ) {
                                                    vm.processIntent(AddWalletIntents.ChoosingCurrency(correctIndex)) // Используем правильный индекс
                                                },
                                            contentAlignment = Alignment.Center
                                        ) {
                                            Image(
                                                painter = painterResource(AddWalletViewModel.addWalletState.listCurrency[correctIndex]), // Используем правильный индекс
                                                contentDescription = null,
                                                modifier = Modifier.fillMaxSize()
                                            )
                                            Image(
                                                painter = painterResource(image),
                                                contentDescription = null,
                                                modifier = Modifier.size(30.dp)
                                            )
                                        }
                                    }
                                }
                            }
                        }
                        Image(
                            painter = painterResource(Res.drawable.finish_button),
                            contentDescription = null,
                            modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(0.17f)
                                .clickable(
                                    indication = null, // Отключение эффекта затемнения
                                    interactionSource = remember { MutableInteractionSource() })
                                { vm.processIntent(AddWalletIntents.Finish) }
                        )
                    }
                }
            }
        }
    }
}