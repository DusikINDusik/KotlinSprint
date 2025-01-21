package org.example.Lesson5

fun main() {
    println("Для доступа решите задачу: 5 + 10")

    var userAsk = readln().toInt()

    if (userAsk == 15) {
        println("Добро пожаловать")
    }
    else {
        println("Доступ запрещен.")
    }
}