package org.example.project.presentation.wish_list.detail_goal_feature.viewmodel.intents

import org.example.project.core.StaticDate
import org.example.project.presentation.wish_list.detail_goal_feature.viewmodel.DetailGoalViewModel
import org.example.project.presentation.wish_list.target_feature.viewmodel.TargetViewModel
import org.example.project.presentation.wish_list.wish_list_feature.screen.WishListScreen

object YesIntent {
    fun execute(){
        DetailGoalViewModel(StaticDate).date.listGoals.removeAt(DetailGoalViewModel(StaticDate).date.goalNow.value)
        TargetViewModel(StaticDate).date.isUsedWishList.value = true
        StaticDate.navigator.push(WishListScreen)
    }
}