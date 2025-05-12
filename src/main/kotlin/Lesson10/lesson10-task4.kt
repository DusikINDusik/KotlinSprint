package org.example.Lesson10

fun main() {
    var wins = 0

    var userAnswer: String

    do{
        var total = conductingRound()
        if (total == true){
            wins++
        }
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        userAnswer = readln()
    }while(userAnswer == "Да")
    println("Вы выиграли $wins партий")
}

fun rollDice() : Int {
    var randomValue = (1..6).random()
    return randomValue
}

fun conductingRound(): Boolean {
    var humanProgress = rollDice()
    println("Ход человека: $humanProgress")

    Thread.sleep(1000)

    var computerProgress = rollDice()
    println("Ход компьютера: $computerProgress")

    if(humanProgress > computerProgress){
        println("Победило человечество")
        return true
    }else if (humanProgress < computerProgress){
        println("Победила машина")
        return false
    } else println("Победила дружба!")
    return false
}


