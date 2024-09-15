package org.example.project.presentation.statistic_feature.model

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.material.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.example.project.presentation.add_transaction.finish_fetaure.viewmodel.FinishViewModel
import org.example.project.presentation.statistic_feature.viewmodel.StatisticViewModel
import org.jetbrains.compose.resources.painterResource


@Composable
fun Transactions(){
    Column(modifier = Modifier.fillMaxSize()
    , horizontalAlignment = Alignment.CenterHorizontally
    , verticalArrangement = Arrangement.Top) {
        Text(
            "Transactions", color = Color.Black, fontSize = 23.sp,
            fontWeight = FontWeight.Bold,modifier = Modifier.padding(top = 20.dp)
        )
        LazyColumn {
            itemsIndexed(StatisticViewModel.statisticState.listTransactions) { index, item ->
                Row(
                    modifier = Modifier.padding(top = 10.dp)
                        .fillMaxWidth(0.9f),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(FinishViewModel.finishState.transaction.value.img),
                            contentDescription = null,
                            modifier = Modifier.size(50.dp)
                        )
                        Column {
                            Text(
                                text = "   ${FinishViewModel.finishState.transaction.value.category}",
                                color = Color.Black,
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "   ${FinishViewModel.finishState.transaction.value.name}",
                                color = Color.Black,
                                fontSize = 15.sp
                            )
                        }
                    }
                    Column(horizontalAlignment = Alignment.End) {
                        Text(
                            text = "${FinishViewModel.finishState.transaction.value.sign}${FinishViewModel.finishState.transaction.value.sum}",
                            color = FinishViewModel.finishState.transaction.value.color,
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "${FinishViewModel.finishState.transaction.value.month} ${FinishViewModel.finishState.transaction.value.day}, ${FinishViewModel.finishState.transaction.value.year}",
                            color = Color.Black,
                            fontSize = 12.sp
                        )
                    }
                }
            }
        }
    }
}