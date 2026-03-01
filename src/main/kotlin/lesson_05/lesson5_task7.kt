package lesson_05

import java.math.RoundingMode

fun main() {
    print("Введите расстояние поездки (в километрах):>> ")
    val distance = readln().toFloat()
    print("Введите расход топлива на 100 км (в литрах):>> ")
    val fuel = readln().toFloat()
    print("Введите текущую цену за литр топлива:>> ")
    val fuelPrice = readln().toFloat()

    val requiredFuel = (distance * fuel) / 100.0
    val totalFuelCost = requiredFuel * fuelPrice

    println(
        """
        Общее количество необходимого топлива: ${requiredFuel.toBigDecimal().setScale(2, RoundingMode.HALF_UP)}
        Итоговая цена за поездку: ${totalFuelCost.toBigDecimal().setScale(2, RoundingMode.HALF_UP)}
    """.trimIndent()
    )
}