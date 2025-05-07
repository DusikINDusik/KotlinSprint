package org.example.Lesson8

fun main() {
    var ingridients = arrayOf("мука", "дрожжи", "соль", "вода")

    println("Какой ингредиент вы хотите найти?")

    var userAnswer = readln()

    var found = false

    ingridients.forEach { search ->
        (search)

        if (search == userAnswer) {
            println("Ингредиент $search в рецепте есть")
            found = true
        }
    }
    if (!found)
        println("Такого ингридиента нет")
}


