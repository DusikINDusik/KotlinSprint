package org.example.Lesson6

fun main() {
    println("Сколько секунд засечь?")
    var timer = readln().toLong()

    Thread.sleep(timer * MILLIS)

    println("Прошло $timer секунд")

}
const val MILLIS = 1000