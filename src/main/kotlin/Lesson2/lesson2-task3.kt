package org.example.Lesson2

fun main() {
    var hourOut: Int = 9
    var minuteOut: Int = 39
    var tripMinutes: Int = 457

    var hour = tripMinutes / MINUTE_IN_HOUR
    var minute = tripMinutes % MINUTE_IN_HOUR

    var arrivalHour = hourOut + hour + ((minuteOut + minute) / MINUTE_IN_HOUR)
    var arrivalMinutes = (minuteOut + minute) % MINUTE_IN_HOUR

    println("$arrivalHour:$arrivalMinutes")

}

const val MINUTE_IN_HOUR = 60