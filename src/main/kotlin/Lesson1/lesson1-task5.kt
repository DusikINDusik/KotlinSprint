package org.example.Lesson1

fun main() {
    var secondsInSpace = 6480
    var hourInSpace = 6480 / 3600
    var minuteInSpase = (secondsInSpace - (hourInSpace * SECOND_IN_HOUR)) / SECOND_IN_MINUTE
    var secondInSpace = minuteInSpase / SECOND_IN_MINUTE

    println("$hourInSpace:$minuteInSpase:$secondInSpace")

}

const val SECOND_IN_HOUR = 3600
const val SECOND_IN_MINUTE = 60