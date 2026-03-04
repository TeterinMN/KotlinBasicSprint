package lesson_05

import kotlin.math.pow

const val MIN_NORMAL_WEIGHT = 18.5
const val MAX_NORMAL_WEIGHT = 25.0
const val OVERWEIGHT = 30.0

fun main() {
    print("Введите свой рост: >> ")
    val height = readln().toFloat()

    print("Введите свой вес: >> ")
    val weight = readln().toFloat()

    val bmi = weight / (height / 100.0).pow(2.0)
    val result = when {
        bmi <= MIN_NORMAL_WEIGHT -> "Недостаточная масса тела"
        bmi <= MAX_NORMAL_WEIGHT -> "Нормальная масса тела"
        bmi <= OVERWEIGHT -> "Избыточная масса тела"
        else -> "Ожирение"
    }
    println(result)
}