package org.example.Lesson5

import kotlin.jvm.internal.Ref.FloatRef

fun main() {
    println("Введите первое число")

    val userFirstAsk = readln().toInt()

    println("Введите второе число")

    val userSecondAsk = readln().toInt()

    if (userFirstAsk == FIRST_WIN_NUMBER && userSecondAsk == SECOND_WIN_NUMBER ||
        userFirstAsk == SECOND_WIN_NUMBER && userSecondAsk == FIRST_WIN_NUMBER
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (userFirstAsk == FIRST_WIN_NUMBER || userSecondAsk == SECOND_WIN_NUMBER ||
        userFirstAsk == SECOND_WIN_NUMBER || userSecondAsk == FIRST_WIN_NUMBER
    ) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача.")
    }
    println("Выигрышные числа $FIRST_WIN_NUMBER и $SECOND_WIN_NUMBER")
}

const val FIRST_WIN_NUMBER = 15
const val SECOND_WIN_NUMBER = 33