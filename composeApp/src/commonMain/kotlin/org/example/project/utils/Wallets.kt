package org.example.project.utils

import org.jetbrains.compose.resources.DrawableResource

data class Wallets(var sum:String,var name:String,var currency:DrawableResource
,var listTransactionsIncome:MutableList<Transaction>,var listTransactionsExpense:MutableList<Transaction>
,var listTransactions:MutableList<SumWallet>)
