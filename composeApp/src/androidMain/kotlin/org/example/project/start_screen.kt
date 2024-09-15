package org.example.project

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import org.jetbrains.compose.resources.painterResource
import piechart.composeapp.generated.resources.Res
import piechart.composeapp.generated.resources.compose_multiplatform

@Preview
@Composable
fun Show(){
    StartScreen.Content()
}
object StartScreen{
    @Composable
    fun Content(){
    Box(modifier = Modifier.fillMaxSize()){
    Box(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(0.5f)
        .background(Color.White)){
    Image(painter = painterResource(Res.drawable.compose_multiplatform), contentDescription = null)
    }
    }
    }
}