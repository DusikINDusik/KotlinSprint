package org.example.Lesson4

fun main() {
    val workoutDay = 6
    val calculetWorcoutDay = workoutDay % 2
    println(
        """Упражнения для рук:   ${ARM_MUSCLES && calculetWorcoutDay != DAY}
       |Упражнения для ног:   ${LEG_MUSCLES && calculetWorcoutDay == DAY}
       |Упражнения для спины: ${BACK_MUSCLES && calculetWorcoutDay == DAY}
       |Упражнения для пресса:${PRESS_MUSCLES && calculetWorcoutDay != DAY}
    """.trimMargin()
    )


}

const val ARM_MUSCLES: Boolean = true
const val PRESS_MUSCLES: Boolean = true
const val LEG_MUSCLES: Boolean = true
const val BACK_MUSCLES: Boolean = true
const val DAY = 0