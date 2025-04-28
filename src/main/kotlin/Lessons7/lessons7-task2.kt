package org.example.Lessons7

fun main() {
    while (true) {

        var newCode = (1000..9999).random()

        println("Ваш код авторизации: $newCode")

        println("Введите код для авторизации")

        var userAnswer = readln().toInt()

        if (newCode == userAnswer) {
            println("Добро пожаловать")
            break
        } else println("Неверный код")

    }
}
