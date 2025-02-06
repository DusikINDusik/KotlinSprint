package org.example.Lesson4

fun main() {
    val workoutDay = 7
    val calculetWorcoutDay = workoutDay % 2
    val isEven: Boolean = 0 == calculetWorcoutDay

    val armMuscule: Boolean = 1 == calculetWorcoutDay
    val legMuscule: Boolean = 0 == calculetWorcoutDay
    val backMuscule: Boolean = 0 == calculetWorcoutDay
    val pressMuscule: Boolean = 1 == calculetWorcoutDay

    println(
        """Упражнения для рук:   ${armMuscule && !isEven}
       |Упражнения для ног:   ${legMuscule && isEven}
       |Упражнения для спины: ${backMuscule && isEven}
       |Упражнения для пресса:${pressMuscule && !isEven}
    """.trimMargin()
    )

}