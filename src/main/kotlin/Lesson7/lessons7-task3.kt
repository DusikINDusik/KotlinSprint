package org.example.Lessons7

fun main() {
    println("Введи число:")

    var userNumber = readln().toInt()

    //var evenNumber = 0..userNumber step 2

    for (search in (0.. userNumber).step(2)) {
        println(search)
    }
}

