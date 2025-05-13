package org.example.Lesson11

class User(
    val userId: Int,
    val login: String,
    val password: String,
    val email: String,
) {

}

fun main() {
    var userNumberOne = User(
        userId = 1,
        login = "Mike",
        password = "PaSs123",
        email = "example@mail.com"
    )

    var userNumberTwo = User(
        userId = 2,
        login = "Bob",
        password = "Aa123&",
        email = "example_too@mail.com"
    )

    println(userNumberOne.userId)
    println(userNumberOne.login)
    println(userNumberOne.password)
    println(userNumberOne.email)
    println()
    println(userNumberTwo.userId)
    println(userNumberTwo.login)
    println(userNumberTwo.password)
    println(userNumberTwo.email)
}