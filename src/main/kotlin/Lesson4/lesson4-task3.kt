package org.example.Lesson4

fun main() {
    var goodWeather: Boolean = true
    var awningIsOpen: Boolean = true
    var airHumidity = 20
    var season = "лето"

    var calculationOfConditions =
        goodWeather == SUNNY_WEATHER && awningIsOpen == AWNING_IS_OPEN && airHumidity == GOOD_AIR_HUMIDITY && season != GOOD_SEASON

    println("Благоприятные ли сейчас условия для роста бобовых?$calculationOfConditions")

}

const val SUNNY_WEATHER: Boolean = true
const val AWNING_IS_OPEN: Boolean = true
const val GOOD_AIR_HUMIDITY: Int = 20
const val GOOD_SEASON: String = "зима"