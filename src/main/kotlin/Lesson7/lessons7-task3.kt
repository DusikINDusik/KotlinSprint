package org.example.Lessons7

fun main() {
    println("Введи число:")

    var userNumber = readln().toInt()

    for (theParity in 0..userNumber){
        if (theParity % 2 == 0) {
            println(theParity)
        }
    }


}

