package org.example.Lesson9

fun main() {

    var baseIngridients = mutableListOf("Вода", "Яйцо", "Мука")

    println("В рецепте есть базовые ингредиенты:")

    for (search in baseIngridients) {
        println(search)
    }

    println("Желаете добавить еще?")

    var userAnswer = readln()

    if (userAnswer.equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")

        var userAnswer2 = readln()

        baseIngridients.add(userAnswer2)

        println("Теперь в рецепте есть следующие ингредиенты:")
        for (search2 in baseIngridients) {
            println(search2)
        }
    }

}
