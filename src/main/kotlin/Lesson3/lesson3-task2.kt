package org.example.Lesson3

fun main() {
    var surname = "Андреева"
    val name = "Татьяна"
    val middleName = "Сергеевна"
    var age = 20

    println("до замужества: $surname $name $middleName $age лет")

    surname = "Сидорова"
    age = 22

    println("после замужества: $surname $name $middleName $age года")
}