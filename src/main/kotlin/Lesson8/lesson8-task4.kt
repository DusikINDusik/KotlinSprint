package org.example.Lesson8

fun main() {

    var ingridients = arrayOf("мука", "дрожжи", "соль", "вода")

    for (search in ingridients) {
        println("Ингредиент ${ingridients.indexOf(search) + 1}: $search")
    }

    println("Какой ингредиент вы хотели бы заменить?")

    var userAnswer = readln()

    var changeItem = ingridients.indexOf(userAnswer)

    var found = false

    if (changeItem == -1) {
        println("Такого ингредиента нет в рецепте")
    } else {
        println("Да, такой ингредиент есть, можем его заменить!\nКакой игредиент добавить?")

        var userChange = readln()

        ingridients[changeItem] = userChange

        println("Готово! Вы сохранили следующий список:")
        for (search1 in ingridients) {
            println("${ingridients.indexOf(search1) + 1}: $search1")
        }

    }
}


