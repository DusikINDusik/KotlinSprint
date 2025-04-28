package org.example.Lessons7

fun main() {
    println("Сколько секунд засечь?")
    var userTimer = readln().toInt()

    for (i in userTimer downTo 0) {
        println("Осталось $i секунд")
        Thread.sleep(1000)
    }
    println("Время вышло")
}