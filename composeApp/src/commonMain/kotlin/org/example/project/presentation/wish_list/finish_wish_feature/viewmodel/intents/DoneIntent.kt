package org.example.project.presentation.wish_list.finish_wish_feature.viewmodel.intents

import org.example.project.core.StaticDate
import org.example.project.presentation.wish_list.finish_wish_feature.viewmodel.FinishWishViewModel
import org.example.project.presentation.wish_list.target_feature.viewmodel.TargetViewModel
import org.example.project.presentation.wish_list.wish_list_feature.screen.WishListScreen

object DoneIntent {
    fun execute(){
        FinishWishViewModel(StaticDate).date.listGoals.add(FinishWishViewModel.finishWishState.newGoal.value)
        TargetViewModel(StaticDate).date.isUsedWishList.value = true
        StaticDate.navigator.push(WishListScreen)
    }
}