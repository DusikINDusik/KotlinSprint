package org.example.Lesson6

fun main() {
    var validInput = false

    println("Для регистрации придуйте логин и пароль")

    println("Придумайте логин")
    var newUserName = readln()

    println("Придумайте пароль")
    var newUserPassword = readln()

    while (!validInput) {
        println("Введите свой логин")
        var userName = readln()

        println("Введите свой пароль")
        var userPassword = readln()

        if (newUserName == userName && newUserPassword == userPassword) {
            validInput = true
            println("Авторизация прошла успешно")
        } else {
            println("Введенные данные неверные, попробуйте еще раз")
        }
    }
}