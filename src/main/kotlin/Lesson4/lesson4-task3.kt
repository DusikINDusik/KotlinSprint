package org.example.Lesson4

fun main() {
    var goodWeather: Boolean = true
    var awningIsOpen: Boolean = true
    var airHumidity = 20
    var season = "зима"

    var calculationOfConditions = goodWeather && awningIsOpen && airHumidity==GOOD_AIR_HUMIDITY && season==GOOD_SEASON

    println("Благоприятные ли сейчас условия для роста бобовых?$calculationOfConditions")

}

const val GOOD_AIR_HUMIDITY = 20
const val GOOD_SEASON = "не зима"