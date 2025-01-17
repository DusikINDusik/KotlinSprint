package org.example.Lesson3

fun main() {
    var stepInformation = "D2-D4;0"
    var parts = stepInformation.split("-", ";")

    var whereFrom = parts[0]
    var where = parts[1]
    var stepNumber = parts[2]

    println("Из какой клетки - $whereFrom, в клетку - $where, номер хода - $stepNumber")
}