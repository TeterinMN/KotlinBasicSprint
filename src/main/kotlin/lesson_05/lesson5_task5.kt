package lesson_05

import kotlin.random.Random
import kotlin.random.nextInt

const val MIN_NUMBER = 0
const val MAX_NUMBER = 42
private const val JACKPOT_MATCHES = 3
private const val MAIN_PRIZE_MATCHES = 2
private const val CONSOLATION_PRIZE_MATCHES = 1

fun main() {
    val number = mutableListOf(
        Random.nextInt(MIN_NUMBER..MAX_NUMBER),
        Random.nextInt(MIN_NUMBER..MAX_NUMBER),
        Random.nextInt(MIN_NUMBER..MAX_NUMBER)
    )
    println(number)
    println("Введите поочередно три числа")
    val userInput = mutableListOf(readln().toInt(), readln().toInt(), readln().toInt())
    val matchesCount = number.intersect(userInput.toSet())

    val result = when (matchesCount.size) {
        JACKPOT_MATCHES -> "Ты угадал все числа и выиграл джекпот"
        MAIN_PRIZE_MATCHES -> "Ты угадал два числа и получаешь крупный приз"
        CONSOLATION_PRIZE_MATCHES -> "Ты угадал одно число и получаешь утешительный приз"
        else -> "Сочувствую, ты не угадал ни одного числа"
    }

    println(result)
    print("Загаданные числа: $number")
}