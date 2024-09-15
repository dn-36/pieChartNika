package org.example.project.utils

import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.DrawableResource

data class Transaction(val img: DrawableResource, val category:String, val name:String
                       , val month:String, val day:String, val year:String
                       , val sum:String,val sign:String,val color:Color)