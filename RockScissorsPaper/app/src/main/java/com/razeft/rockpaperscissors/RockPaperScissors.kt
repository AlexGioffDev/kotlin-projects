package com.razeft.rockpaperscissors

fun main() {

    println("ROCK - PAPER - SCISSORS? Enter your choice!")
    var playerChoice: String = readln()

    val randomNUmber = (1..3).random()

    val computerChoice = when(randomNUmber){
        1 -> "ROCK"
        2 -> "PAPER"
        3 -> "SCISSORS"
        else -> "ROCK"
    }

    println(computerChoice)

    val winner = when {
        playerChoice.lowercase() == computerChoice.lowercase() -> "Tie"
        playerChoice.lowercase() == "rock" && computerChoice.lowercase() == "scissors" -> "Player"
        playerChoice.lowercase() == "paper" && computerChoice.lowercase() == "rock" -> "Player"
        playerChoice.lowercase() == "scissors" && computerChoice.lowercase() == "paper" -> "Player"
        else -> "Computer"
    }

    if (winner == "Tie") {
        println("The match ended with a tie")
    } else {
        println("The winner was $winner")
    }

}