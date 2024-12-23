package com.razeft.bankaccountapp

fun main() {
    val deniseBankAccount: BankAccount = BankAccount("Denis", 1338.20)
    deniseBankAccount.deposit(200.0)
    deniseBankAccount.displayTransactionHistory()
    deniseBankAccount.withdraw(1200.0)
    deniseBankAccount.deposit(3000.0)
    deniseBankAccount.deposit(500.0)
    deniseBankAccount.withdraw(2000.0)
    deniseBankAccount.displayTransactionHistory()
    deniseBankAccount.accBalance()
}