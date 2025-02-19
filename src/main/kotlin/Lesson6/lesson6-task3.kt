package org.example.Lesson6

fun main() {
    println("Сколько секунд засечь?")
    var timer = readln().toInt()
    var countdown = timer

    while (countdown > 0) {
        println("Осталось секунд: ${countdown--}")
        Thread.sleep(1000)
    }
    println("Время вышло")
}