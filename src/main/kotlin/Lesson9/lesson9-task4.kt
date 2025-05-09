package org.example.Lesson9

fun main() {

    println("Какие пять ингредиентов, вы хотите перечислить?")

    var userAnswer = readln()

    var list = userAnswer.split(" ", " ")

    println(list.sorted())
}