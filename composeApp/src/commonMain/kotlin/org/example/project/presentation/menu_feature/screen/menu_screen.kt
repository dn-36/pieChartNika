package org.example.project.presentation.menu_feature.screen

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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.material.Text
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import org.example.project.core.StaticDate
import org.example.project.presentation.menu_feature.viewmodel.MenuIntents
import org.example.project.presentation.menu_feature.viewmodel.MenuViewModel
import org.jetbrains.compose.resources.painterResource
import piechart.composeapp.generated.resources.Res
import piechart.composeapp.generated.resources.back_button
import piechart.composeapp.generated.resources.balance
import piechart.composeapp.generated.resources.calculator
import piechart.composeapp.generated.resources.circle
import piechart.composeapp.generated.resources.pie_chart

object MenuScreen:Screen{
    val vm = MenuViewModel(StaticDate)
    @Composable
    override fun Content() {
        Box(modifier = Modifier.fillMaxSize()) {
            Column {

                Box(
                    modifier = Modifier
                        .fillMaxHeight(0.4f)
                        .fillMaxWidth()
                        .background(Color.DarkGray)
                ) {
                    Row(
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .padding(top = 20.dp, start = 20.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(Res.drawable.circle),
                            contentDescription = null,
                            modifier = Modifier.size(60.dp)
                        )
                        Column {
                            Text(text = "Hello", color = Color.White, fontSize = 12.sp)
                            Text(text = "John", color = Color.White, fontSize = 15.sp)
                        }
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxHeight(0.7f)
                            .align(Alignment.BottomCenter),
                        verticalArrangement = Arrangement.SpaceAround
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
                                        .fillMaxWidth(0.8f)
                                        .fillMaxHeight(0.3f)
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
                                    Image(
                                        painter = painterResource(Res.drawable.balance),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(30.dp)
                                            .align(Alignment.BottomEnd)
                                    )
                                }
                            }
                        }
                        Row(
                            modifier = Modifier.fillMaxWidth(0.8f),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Image(
                                painter = painterResource(Res.drawable.balance),
                                contentDescription = null,
                                modifier = Modifier.size(70.dp)
                            )
                            Image(
                                painter = painterResource(Res.drawable.pie_chart),
                                contentDescription = null,
                                modifier = Modifier.size(70.dp)
                            )
                            Image(
                                painter = painterResource(Res.drawable.calculator),
                                contentDescription = null,
                                modifier = Modifier.size(70.dp)
                            )
                        }
                        Row(
                            modifier = Modifier.fillMaxWidth(0.8f),
                            horizontalArrangement = Arrangement.SpaceAround
                        ) {
                            Text(text = "Income", color = Color.White, fontSize = 20.sp)
                            Text(text = "Expense", color = Color.White, fontSize = 20.sp)
                        }
                    }
                }
                Box(
                    modifier = Modifier
                        .fillMaxHeight(0.8f)
                        .fillMaxWidth()
                        .background(Color.White)
                    , contentAlignment = Alignment.BottomCenter
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally
                        , modifier = Modifier.fillMaxHeight(0.95f)) {
                        Row(modifier = Modifier.fillMaxWidth(0.85f)
                            , horizontalArrangement = Arrangement.SpaceBetween) {
                            Text(text = "Day", color = Color.Black, fontSize = 15.sp, fontWeight = FontWeight.Bold)
                            Text(text = "Week", color = Color.Black, fontSize = 15.sp, fontWeight = FontWeight.Bold)
                            Text(text = "Mounth", color = Color.Black, fontSize = 15.sp, fontWeight = FontWeight.Bold)
                            Text(text = "Year", color = Color.Black, fontSize = 15.sp, fontWeight = FontWeight.Bold)
                        }
                        LazyColumn(modifier = Modifier.padding(top = 10.dp)) {
                            itemsIndexed(listOf("gfgfgfg","gfgfgfg")){index,item ->
                                Row(modifier = Modifier
                                    .padding(top = 10.dp)
                                    .fillMaxWidth(0.9f)
                                    , horizontalArrangement = Arrangement.SpaceBetween
                                    , verticalAlignment = Alignment.CenterVertically){
                                    Row(verticalAlignment = Alignment.CenterVertically) {
                                        Image(
                                            painter = painterResource(Res.drawable.circle),
                                            contentDescription = null,
                                            modifier = Modifier.size(50.dp)
                                        )
                                        Column {
                                            Text(
                                                text = "   Bank Transfer",
                                                color = Color.Black,
                                                fontSize = 15.sp,
                                                fontWeight = FontWeight.Bold
                                            )
                                            Text(
                                                text = "   ggfhdhdjdjdjdjdhd",
                                                color = Color.Black,
                                                fontSize = 15.sp
                                            )
                                        }
                                    }
                                    Column {
                                        Text(text = "+2020", color = Color.Black, fontSize = 17.sp, fontWeight = FontWeight.Bold)
                                        Text(text = "12.0998", color = Color.Black, fontSize = 12.sp)
                                    }
                                }
                            }
                        }
                    }
                }
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(Color.DarkGray)
                    , contentAlignment = Alignment.Center){
                    Row (modifier = Modifier.fillMaxWidth(0.9f)
                        , horizontalArrangement = Arrangement.SpaceBetween){
                        Row(modifier = Modifier.fillMaxWidth(0.4f),
                            horizontalArrangement = Arrangement.SpaceBetween) {
                            Image(
                                painter = painterResource(Res.drawable.back_button),
                                contentDescription = null,
                                modifier = Modifier.size(60.dp)
                            )
                            Image(
                                painter = painterResource(Res.drawable.back_button),
                                contentDescription = null,
                                modifier = Modifier.size(60.dp)
                            )
                        }
                        Row(modifier = Modifier.fillMaxWidth(0.68f),
                            horizontalArrangement = Arrangement.SpaceBetween) {
                            Image(
                                painter = painterResource(Res.drawable.back_button),
                                contentDescription = null,
                                modifier = Modifier.size(60.dp)
                            )
                            Image(
                                painter = painterResource(Res.drawable.back_button),
                                contentDescription = null,
                                modifier = Modifier.size(60.dp)
                            )
                        }
                    }
                    Image(painter = painterResource(Res.drawable.back_button), contentDescription = null,
                        modifier = Modifier.size(50.dp).align(Alignment.TopCenter)
                            .clickable(
                                indication = null, // Отключение эффекта затемнения
                                interactionSource = remember { MutableInteractionSource() }){
                                vm.processIntent(MenuIntents.AddTransaction)
                            })
                }
            }

        }
    }

}