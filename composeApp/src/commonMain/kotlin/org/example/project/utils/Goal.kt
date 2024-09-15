package org.example.project.utils

import org.jetbrains.compose.resources.DrawableResource

data class Goal(val img:DrawableResource,val target:String,
    val sum:Int,var already:Int,var transactions:Int,val date:Int)
