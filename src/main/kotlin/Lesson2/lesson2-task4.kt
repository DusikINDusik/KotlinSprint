package org.example.Lesson2

fun main() {
    var crystalOre = 7
    var ironOre = 11

    var buff = 20

    var buffCrystalOre = (crystalOre * buff) / 100
    var buffIronOre = (ironOre * buff) / 100

    var finalCrystalOre = buffCrystalOre + crystalOre
    var finalIronOre = buffIronOre + ironOre

    println(finalCrystalOre)
    println(finalIronOre)
}