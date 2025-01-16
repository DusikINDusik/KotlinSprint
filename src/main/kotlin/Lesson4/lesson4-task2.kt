package org.example.Lesson4

fun main() {
    //var weight = 20
    //var liters = 80

    //println ("Груз с весом $weight кг и объемом $liters л соответствует категории \'Average\':${weight>averageMinWeight && weight<=averageMaxWeight && liters<averageLiters}")

    var weight = 50
    var liters = 10

    println ("Груз с весом $weight кг и объемом $liters л соответствует категории \'Average\':${weight>averageMinWeight && weight<=averageMaxWeight && liters<averageLiters}")
}
const val averageMinWeight = 35
const val averageMaxWeight = 100
const val averageLiters = 100