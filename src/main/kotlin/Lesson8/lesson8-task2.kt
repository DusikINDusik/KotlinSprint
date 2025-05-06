package org.example.Lesson8

fun main() {
    var ingridients = arrayOf("мука", "дрожжи", "соль", "вода")

    println("Какой ингредиент вы хотите найти?")

    var userAnswer = readln()

    var found = false

    for (search in ingridients) {

        if (search == userAnswer) {
            println("Ингредиент $search в рецепте есть")
            found = true
            break
        }
    }
    if (!found){
        println("Такого ингридиента нет")
}


}