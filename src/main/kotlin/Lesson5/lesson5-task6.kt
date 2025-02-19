package org.example.Lesson5

fun main() {
    println("Введите ваш вес в килограммах")
    val weight = readln().toDouble()

    println("Введите ваш рост в сантиметрах")
    val height = readln().toDouble()

    val santimetrInMetr = height / SANTIMETR_IN_METR

    val bmi = weight / Math.pow(santimetrInMetr, EXPONENT)
    if (bmi < SMALL_HEIGHT) {
        println("Недостаточная масса тела")
    } else if (bmi >= SMALL_HEIGHT && bmi < GOOD_HEIGHT) {
        println("Нормальная масса тела")
    } else if (bmi >= GOOD_HEIGHT && bmi < OVER_WEIGHT) {
        println("Избыточная масса тела")
    } else if (bmi >= OVER_WEIGHT) {
        println("Ожирение")
    }
}

const val SANTIMETR_IN_METR = 100
const val EXPONENT = 2.0
const val SMALL_HEIGHT = 18.5
const val GOOD_HEIGHT = 25
const val OVER_WEIGHT = 30
