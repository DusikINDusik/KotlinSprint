package org.example.Lesson10

fun main() {

    println("Какой длины должен быть пароль?")
    var userAnswer = readln().toInt()

    randomizer(count = userAnswer)

}

fun randomizer(count: Int) {

    var password = ""

    for (i in 0 until count) {

        val randomNumber = ('0'..'9').random()
        val randomChar = ("!\"#\$%&'()*+,-./ ").random()

        if (i % 2 == 0) {
            password += randomNumber
        } else password += randomChar
    }
    println(password)
}