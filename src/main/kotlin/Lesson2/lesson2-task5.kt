package org.example.Lesson2

fun main() {
    var depositAmount: Double = 70000.0
    val percentDeposit: Double = 16.7
    var yearDeposit: Double = 20.0
    var dayOfYear: Double = 365.0

    var percentCalculation =
        depositAmount * Math.pow((1 + percentDeposit * dayOfYear / dayOfYear / FULL_PERCENT), yearDeposit)
    var profitSumm = String.format("%.3f", percentCalculation)

    println(profitSumm)
}

const val FULL_PERCENT: Double = 100.0