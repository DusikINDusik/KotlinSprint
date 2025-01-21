package org.example.Lesson5

fun main() {
    println("Введите первое число")

    var userFirstAsk = readln().toInt()

    println("Введите второе число")

    var userSecondAsk = readln().toInt()

    if (userFirstAsk == FIRST_WIN_NUMBER && userFirstAsk == SECOND_WIN_NUMBER || userSecondAsk == FIRST_WIN_NUMBER && userSecondAsk == SECOND_WIN_NUMBER) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (userFirstAsk == FIRST_WIN_NUMBER || userFirstAsk == SECOND_WIN_NUMBER || userSecondAsk == FIRST_WIN_NUMBER || userSecondAsk == SECOND_WIN_NUMBER) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача.")
    }


}

const val FIRST_WIN_NUMBER = 15
const val SECOND_WIN_NUMBER = 33