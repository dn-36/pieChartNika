package org.example.project.presentation.add_transaction_feature.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import org.example.project.core.StaticDate
import org.example.project.presentation.add_transaction_feature.viewmodel.AddTransactionIntents
import org.example.project.presentation.add_transaction_feature.viewmodel.AddTransactionViewModel
import org.jetbrains.compose.resources.painterResource
import piechart.composeapp.generated.resources.Res
import piechart.composeapp.generated.resources.back_button
import piechart.composeapp.generated.resources.next_button

object AddTransactionScreen:Screen {
    val vm = AddTransactionViewModel(StaticDate)
    @Composable
    override fun Content() {
        Box(modifier = Modifier.fillMaxSize()) {
            Column {

                Box(
                    modifier = Modifier
                        .fillMaxHeight(0.25f)
                        .fillMaxWidth()
                        .background(Color.DarkGray)
                ) {
                    Image(
                        painter = painterResource(Res.drawable.back_button),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(top = 20.dp, start = 20.dp)
                            .size(30.dp)
                            .align(Alignment.TopStart)
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxHeight(0.7f)
                            .align(Alignment.BottomCenter),
                        verticalArrangement = Arrangement.SpaceAround
                        , horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Box() {
                            Column {
                                Text(
                                    text = "Balance",
                                    color = Color.White,
                                    fontSize = 15.sp,
                                    modifier = Modifier.padding(bottom = 5.dp)
                                )
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth(0.85f)
                                        .fillMaxHeight(0.6f)
                                        .border(
                                            1.dp,
                                            color = Color.White,
                                            RoundedCornerShape(20.dp)
                                        )
                                ) {
                                    Text(
                                        text = "50000$",
                                        color = Color.White,
                                        fontSize = 35.sp,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier.align(Alignment.Center)
                                    )
                                }
                            }
                        }
                        Text(
                            text = "Add Transaction",
                            color = Color.White,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 5.dp)
                        )
                    }
                }
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White)
                    , contentAlignment = Alignment.Center
                ) {
                    Column(modifier = Modifier.fillMaxHeight(0.8f)
                        , verticalArrangement = Arrangement.SpaceBetween
                        , horizontalAlignment = Alignment.CenterHorizontally) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text("Category", fontSize = 15.sp, color = Color.DarkGray)
                            LazyColumn {
                                itemsIndexed(
                                    listOf(
                                        "Bank transfer", "Food",
                                        "Travelling", "Family",
                                        "House", "Pets",
                                        "Taxi", "Car", "Credit",
                                        "Holiday", "Vacation", "Other"
                                    ).chunked(3)
                                ) { indexes, item ->
                                    Row(
                                        modifier = Modifier
                                            .padding(top = 15.dp)
                                            .fillMaxWidth(0.85f),
                                        horizontalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        item.forEachIndexed { index, text ->
                                            val correctIndex =
                                                indexes * 3 + index // Правильная индексация
                                            Box(
                                                modifier = Modifier
                                                    .clip(RoundedCornerShape(25.dp))
                                                    .width(100.dp)
                                                    .height(40.dp)
                                                    .clickable(
                                                        indication = null, // Отключение эффекта затемнения
                                                        interactionSource = remember { MutableInteractionSource() }
                                                    ) {
                                                        vm.processIntent(AddTransactionIntents.ChoosingCategory(correctIndex))
                                                    }
                                                    .background(AddTransactionViewModel.addTransactionState.listColors[correctIndex]),
                                                contentAlignment = Alignment.Center
                                            ) {
                                                Text(
                                                    "${text}",
                                                    color = Color.Black,
                                                    fontSize = 15.sp,
                                                    fontWeight = FontWeight.Bold
                                                )
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        Image(painter = painterResource(Res.drawable.next_button), contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .fillMaxHeight(0.17f)
                                .clickable(
                                    indication = null, // Отключение эффекта затемнения
                                    interactionSource = remember { MutableInteractionSource() })
                                { })
                    }
                }
            }
        }
    }
}