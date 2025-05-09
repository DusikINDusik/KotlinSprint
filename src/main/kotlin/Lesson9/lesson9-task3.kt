package org.example.Lesson9

fun main() {

    var quantityIngridients = mutableListOf(2, 50, 15)

    println("На какое количество человек необходимо приготовить блюдо?")

    var userAnswer = readln().toInt()

    var quantityIngridChanged = quantityIngridients.map{
        it * userAnswer
    }

    println("На $userAnswer порций вам понадобится: Яиц - ${quantityIngridChanged[0]}шт, Молока - ${quantityIngridChanged[1]}мл, Масла - ${quantityIngridChanged[2]}гр.")

}