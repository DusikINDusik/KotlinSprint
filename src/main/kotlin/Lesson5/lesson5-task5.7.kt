package org.example.Lesson5

import java.math.RoundingMode

fun main() {
    println("Введите расстояние поездки(в километрах)")
    var kilometers = readln().toDouble()

    println("Введите расход топлива вашего авто на 100км(в литрах)")
    var fuelСonsumption = readln().toDouble()

    println("Введите текущую цену за литр бензина")
    var casolinePrice = readln().toDouble()

    val necessaryLiters = (kilometers.toBigDecimal().setScale(2, RoundingMode.UP).toDouble() *
            fuelСonsumption.toBigDecimal().setScale(2, RoundingMode.UP).toDouble()) / hundredKilometers
    println("Количество литров необходимое для поездки: $necessaryLiters")

    val generalCasolinePrice = (necessaryLiters.toBigDecimal().setScale(2, RoundingMode.UP).toDouble() *
            casolinePrice.toBigDecimal().setScale(2, RoundingMode.UP).toDouble())
    println("Стоимость количества топлива, которое необходимо для поездки: $generalCasolinePrice")

}


const val hundredKilometers = 100 // для рассчета расхода топлива