package org.example.Lesson5

fun main() {
    println("Введите имя пользователя:")
    var userAsk = readln()

    if (userAsk == USER_NAME) {
        println("Пользователь зарегестрирован")
    } else {
        println("Такого пользователя нет в системе. Зарегестируйтесь")
        return
    }
    println("Введите пароль")
    var userPassAsk = readln()

    if (userPassAsk == USER_PASS) {
        println("Добро пожаловать в систему!")
    } else {
        println("Пароль неверен.")
    }
}

const val USER_NAME = "Zaphod"
const val USER_PASS = "PanGalactic"