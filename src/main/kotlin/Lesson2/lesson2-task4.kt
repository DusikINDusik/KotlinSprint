package org.example.Lesson2

fun main() {
    var crystalOre = 7
    var ironOre = 11

    var buff = 20

    var buffCrystalOre = (crystalOre * buff) / CALCULATING_THE_BUFF
    var buffIronOre = (ironOre * buff) / CALCULATING_THE_BUFF

    var finalCrystalOre = buffCrystalOre + crystalOre
    var finalIronOre = buffIronOre + ironOre

    println(finalCrystalOre)
    println(finalIronOre)
}
const val CALCULATING_THE_BUFF = 100