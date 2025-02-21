package org.example.project.presentation.registerAndStart.add_photo_feature.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import com.preat.peekaboo.image.picker.SelectionMode
import com.preat.peekaboo.image.picker.rememberImagePickerLauncher
import com.preat.peekaboo.image.picker.toImageBitmap
import org.example.project.core.StaticDate
import org.example.project.presentation.registerAndStart.add_photo_feature.viewmodel.AddPhotoIntents
import org.example.project.presentation.registerAndStart.add_photo_feature.viewmodel.AddPhotoViewModel
import org.jetbrains.compose.resources.painterResource
import piechart.composeapp.generated.resources.Res
import piechart.composeapp.generated.resources.gallery_button
import piechart.composeapp.generated.resources.no_thanks_button

object AddPhotoScreen: Screen {
    var vm = AddPhotoViewModel(StaticDate)
    @Composable
    override fun Content(){
       // var img = remember { mutableStateOf<ImageBitmap?>(null) }

        val scope = rememberCoroutineScope()

        val images = remember { mutableStateListOf<ImageBitmap>() }


        val multipleImagePicker = rememberImagePickerLauncher(
            scope = scope,
            selectionMode = SelectionMode.Multiple(),
            onResult = { byteArrays ->
                images += byteArrays.map {
                    it.toImageBitmap()
                }
            }
        )

        //
        Box(modifier = Modifier.fillMaxSize()) {
            Column {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.1f)
                        .background(Color(0xFFF00001F)), contentAlignment = Alignment.Center
                ) {
                    Text("Add a profile photo", color = Color.White, fontSize = 30.sp
                        , fontWeight = FontWeight.Bold)
                }
                Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()
                    .background(Color.White), contentAlignment = Alignment.Center) {
                    Column(modifier = Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.SpaceAround
                        , horizontalAlignment = Alignment.CenterHorizontally) {

                            if (images.size != 0) {
                                Image(
                                    modifier = Modifier
                                        .padding(horizontal = 8.dp)
                                        .size(170.dp)
                                        .clip(CircleShape)
                                        .border(
                                            width = 2.dp,
                                            color = Color.White,
                                            shape = RoundedCornerShape(25.dp)
                                        ),
                                    bitmap = images[0],
                                    contentDescription = null,
                                    contentScale = ContentScale.Crop
                                )
                            }
                        Column {
                            Image(
                            painter = painterResource(Res.drawable.gallery_button),
                            contentDescription = null,
                            modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(0.17f)
                                .clickable(
                                    indication = null, // Отключение эффекта затемнения
                                    interactionSource = remember { MutableInteractionSource() })
                                { if(images.size == 1){
                                    images.removeAt(0)
                                }
                                    multipleImagePicker.launch()}
                        )
                            Image(
                                painter = painterResource(Res.drawable.no_thanks_button),
                                contentDescription = null,
                                modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(0.34f)
                                    .clickable(
                                        indication = null, // Отключение эффекта затемнения
                                        interactionSource = remember { MutableInteractionSource() })
                                    { vm.processIntent(AddPhotoIntents.NoThanks) })}
                    }
                }
            }
        }
    }
}