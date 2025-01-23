package org.example.Lesson5

fun main() {
    println("Для доступа решите задачу: $FIRST_NUMBER + $SECOND_NUMBER")

    var userAsk = readln().toInt()

    if (userAsk == FIRST_NUMBER + SECOND_NUMBER) {
        println("Добро пожаловать")
    } else {
        println("Доступ запрещен.")
    }
}

const val FIRST_NUMBER = 5
const val SECOND_NUMBER = 10