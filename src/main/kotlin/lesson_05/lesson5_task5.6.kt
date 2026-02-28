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
    val result = if (bmi < MIN_NORMAL_WEIGHT) "${"%.2f".format(bmi)} < $MIN_NORMAL_WEIGHT: Недостаточная масса тела"
    else if (bmi in MIN_NORMAL_WEIGHT..<MAX_NORMAL_WEIGHT) "$MIN_NORMAL_WEIGHT <= ${"%.2f".format(bmi)} < ${MAX_NORMAL_WEIGHT.toInt()}: Нормальная масса тела"
    else if (bmi in MAX_NORMAL_WEIGHT..<OVERWEIGHT) "$MAX_NORMAL_WEIGHT <= ${"%.2f".format(bmi)} < ${OVERWEIGHT.toInt()}: Избыточная масса тела"
    else "${"%.2f".format(bmi)} > ${OVERWEIGHT.toInt()}: Ожирение"

    println(result)

}