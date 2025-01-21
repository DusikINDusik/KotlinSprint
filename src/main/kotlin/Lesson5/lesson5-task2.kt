package org.example.Lesson5

fun main() {
    println("Введите дату рождения")

    var userAsk = readln().toInt()
    if (CURRENT_YEAR - userAsk >= AGE_MAJORITY) {
        println("Показывать экран со скрытым контентом")
    }

}

const val AGE_MAJORITY = 18
const val CURRENT_YEAR = 2025