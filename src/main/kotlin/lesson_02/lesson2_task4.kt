package lesson_02

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val bonusPercent = 20
    val fullPercent = 100

    println("Количество бонусов к кристаллической руде: ${(crystalOre * bonusPercent) / fullPercent}")
    println("Количество бонусов к железной руде: ${(ironOre * bonusPercent) / fullPercent}")

}