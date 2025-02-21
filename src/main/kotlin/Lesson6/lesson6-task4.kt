package org.example.Lesson6

fun main() {
    var magicNumber = 8
    var attempts = 4

    println("Отгадайте цифру от 1 до 9")

    while (attempts >= 0) {

        var userAnswer = readln().toInt()

        if (userAnswer == magicNumber) {
            println("Это была великолепная игра!")
            break
        } else {
            println("Неверно. Осталось попыток ${attempts--}")
        }
    }
    println("Была загадана цифра $magicNumber")
}

