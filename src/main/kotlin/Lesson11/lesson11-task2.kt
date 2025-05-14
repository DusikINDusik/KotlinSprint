package org.example.Lesson11

class User2(
    val userId: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = ""
) {
    fun printUserInfo() {
        println("ID пользователя: $userId")
        println("Логин пользователя: $login")
        println("Пароль пользователя: $password")
        println("Электронная почта пользователя: $email")
        println("Информация bio: $bio")
    }

    fun infoBio(): String {
        print("Введите информацию о bio: ")
        var newInfo = readln()
        bio = newInfo
        return newInfo
    }

    fun changePassword() {
        println("Для смены проля введите текущий:")
        var userPassword = readln()
        if (userPassword == password) {
            println("Введите новый пароль:")
            userPassword = readln()
            password = userPassword
            println("Пароль изменен")
        } else println("Неверный пароль")
    }
}

fun main() {

    var user = User2(
        userId = 1,
        login = "Mike",
        password = "Aa123456&",
        email = "example@mail.com"
    )
    user.infoBio()
    user.changePassword()
    user.printUserInfo()
}