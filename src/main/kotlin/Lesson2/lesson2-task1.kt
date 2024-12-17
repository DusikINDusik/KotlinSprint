package org.example.Lesson2

fun main() {
    val scoreOfTheFirstStudent = 3
    val scoreOfTheSecondStudent = 4
    val scoreOfTheThirdStudent = 3
    val scoreOfTheFourthStudent = 5
    val numberOfStudents = 4

    val averageScore = ((scoreOfTheFirstStudent.toFloat() + scoreOfTheSecondStudent.toFloat()+ scoreOfTheThirdStudent.toFloat() + scoreOfTheFourthStudent.toFloat()) / numberOfStudents)

    println(averageScore)
}