package org.example.Lesson4

fun main() {
    val workoutDay = 5
    val isEven = (workoutDay % 2 == 0)

    println(
        """Упражнения для рук:    ${!isEven}
       |Упражнения для ног:    $isEven
       |Упраженение для спины: $isEven
       |Упражнение для пресса: ${!isEven}
     """.trimMargin()
    )

}