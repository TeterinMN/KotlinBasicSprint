package lesson_02

import kotlin.math.pow

fun main() {
    val initialDeposit = 70_000
    val interestRate = (16.7 / 100)
    val depositTerm = 20

    val resultSum = initialDeposit * (1 + interestRate).pow(depositTerm)

    println("%.3f".format(resultSum))
}