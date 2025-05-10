package org.example.Lesson10

fun main() {

    var humanProgress = numberGeneration()

    println("Ход человека: $humanProgress")

    Thread.sleep(1000)

    var computerProgress = numberGeneration()

    println("Ход компьютера: $computerProgress")

    if(humanProgress > computerProgress){
        println("Победило человечество")
    }else if (humanProgress < computerProgress){
        println("Победила машина")
    } else println("Победила дружба!")

}

fun numberGeneration() : Int {
    var randomValue = (1..6).random()
    return randomValue
}