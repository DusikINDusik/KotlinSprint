package org.example.Lesson4

fun main() {
    var weight = 20
    var liters = 80
    var conditionsForCargo = weight > AVERAGE_MIN_WEIGHT && weight <= AVERAGE_MAX_WEIGHT && liters < AVERAGE_LITERS
    //println ("Груз с весом $weight кг и объемом $liters л соответствует категории \'Average\':$conditionsForCargo")

    weight = 50
    liters = 10

    println("Груз с весом $weight кг и объемом $liters л соответствует категории \'Average\':$conditionsForCargo")
}

const val AVERAGE_MIN_WEIGHT = 35
const val AVERAGE_MAX_WEIGHT = 100
const val AVERAGE_LITERS = 100