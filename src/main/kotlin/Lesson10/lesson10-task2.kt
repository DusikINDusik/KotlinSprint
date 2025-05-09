package org.example.Lesson10

fun main() {

    println("Придумайте логин")
    val userLogin = readln()

    println("Придумайте пароль")
    val userPassword = readln()

    if (checkLenghtUserData(userLogin, userPassword)) {
        println("Добро пожаловать!")
    } else println("Логин или пароль недостаточно длинные")
}

fun checkLenghtUserData(Login: String, Password: String): Boolean {
    return Login.length >= 4 && Password.length >= 4
}




