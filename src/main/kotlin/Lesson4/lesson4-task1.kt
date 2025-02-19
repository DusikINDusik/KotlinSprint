package org.example.Lesson4

fun main() {
    var bookedToday = 13
    var bookedTomorrow = 9
    var resultBookedToday = (bookedToday< NUMER_OF_TABLES)
    var resultBookedTomorrow = (bookedTomorrow< NUMER_OF_TABLES)

    println("Доступность столиков на сегодня: $resultBookedToday\nДоступность столиков на завтра: $resultBookedTomorrow")
}
    const val NUMER_OF_TABLES = 13