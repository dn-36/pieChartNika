package org.example.project.presentation.registerAndStart.start_feature.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import org.example.project.core.StaticDate
import org.example.project.presentation.registerAndStart.start_feature.viewmodel.StartIntents
import org.example.project.presentation.registerAndStart.start_feature.viewmodel.StartViewModel
import org.jetbrains.compose.resources.painterResource
import piechart.composeapp.generated.resources.Res
import piechart.composeapp.generated.resources.finance_assistant
import piechart.composeapp.generated.resources.start_avatar
import piechart.composeapp.generated.resources.start_button

object StartScreen:Screen{
    val vm = StartViewModel(StaticDate)
    @Composable
   override fun Content(){
        StaticDate.navigator =  LocalNavigator.currentOrThrow
        Box(modifier = Modifier.fillMaxSize()) {
            Column {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.5f)
                        .background(Color.White), contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(Res.drawable.start_avatar),
                        contentDescription = null,
                        modifier = Modifier.fillMaxWidth(0.8f).fillMaxHeight(0.7f)
                    )
                }
                Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()
                    .background(Color(0xFFF00001F)), contentAlignment = Alignment.Center) {
                Image(painter = painterResource(Res.drawable.start_button), contentDescription = null,
                    modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(0.07f)
                        .clickable(
                            indication = null, // Отключение эффекта затемнения
                            interactionSource = remember { MutableInteractionSource() })
                        { vm.processIntent(StartIntents.Start) })
                }
            }
            Image(painter = painterResource(Res.drawable.finance_assistant), contentDescription = null,
                modifier = Modifier.fillMaxWidth(0.7f).fillMaxHeight(0.1f).align(Alignment.Center))

        }
    }
}