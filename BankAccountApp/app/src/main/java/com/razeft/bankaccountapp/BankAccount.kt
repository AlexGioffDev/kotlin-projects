package com.razeft.bankaccountapp

class BankAccount(var accountHolder: String, var balance: Double) {

    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double){
        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }

    fun withdraw(amount: Double) {
        if(amount > balance){
            println("You don't have the funds to withdraw $$amount")
            return
        }

        balance -= amount
        transactionHistory.add("$accountHolder withdrew $$amount")


    }

    fun accBalance() {
        println("$accountHolder's balance is $${String.format("%.2f", balance)}")
    }

    fun displayTransactionHistory() {
        println("Transaction history for $accountHolder:")
        for(history in transactionHistory){
            println(history)
        }
    }
}