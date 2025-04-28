package org.example.Lessons7

fun main() {
    var count = 3
    var password = ""

    for (i in 1..count) {

        var randomNumber = ('0'..'9').random()
        var randomChar = ('a'..'z').random()
        password += "$randomChar$randomNumber"
    }

    println(password)


}