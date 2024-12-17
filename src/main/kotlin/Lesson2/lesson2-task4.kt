package org.example.Lesson2

fun main () {
    var crystalOre = 7
    var ironOre = 11

    var buff = 20

    var buffCrystalOre = (crystalOre.toFloat() * buff.toFloat()) / 100
    var buffIronOre = (ironOre.toFloat() * buff.toFloat()) / 100

    var finalCrystalOre = buffCrystalOre.toInt() + crystalOre
    var finalIronOre = buffIronOre.toInt() + ironOre

    println(finalCrystalOre)
    println(finalIronOre)
}