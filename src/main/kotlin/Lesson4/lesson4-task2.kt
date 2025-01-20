package org.example.Lesson4

fun main() {
    //var weight = 20
    //var liters = 80

    //println ("Груз с весом $weight кг и объемом $liters л соответствует категории \'Average\':${weight>averageMinWeight && weight<=averageMaxWeight && liters<averageLiters}")

    var weight = 50
    var liters = 10

    println ("Груз с весом $weight кг и объемом $liters л соответствует категории \'Average\':${weight>AVERAGE_MIN_WEIGHT && weight<=AVERAGE_MAX_WEIGHT && liters<AVERAGE_LITERS}")
}
const val AVERAGE_MIN_WEIGHT = 35
const val AVERAGE_MAX_WEIGHT = 100
const val AVERAGE_LITERS = 100