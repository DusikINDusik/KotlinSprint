package org.example.Lesson5

fun main() {
    println("Введите расстояние поездки(в километрах)")
    var kilometers = readln().toDouble()

    println("Введите расход топлива вашего авто на 100км(в литрах)")
    var fuelСonsumption = readln().toDouble()

    println("Введите текущую цену за литр бензина")
    var casolinePrice = readln().toDouble()

    val liters = (kilometers * fuelСonsumption) / hundredKilometers
    val necessaryLiters = String.format("%.2f", liters)
    println("Количество литров необходимое для поездки: $necessaryLiters")

    val price = (liters * casolinePrice)
    val generalCasolinePrice = String.format("%.2f", price)
    println("Стоимость количества топлива, которое необходимо для поездки: $generalCasolinePrice")

}


const val hundredKilometers = 100 // для рассчета расхода топлива