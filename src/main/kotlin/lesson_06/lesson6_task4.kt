package lesson_06

const val MIN_NUMBER = 1
const val MAX_NUMBER = 9
const val NUMBER_OF_ATTEMPTS = 5
const val ZERO_ATTEMPTS = 0

fun main() {
    val hiddenNumber = (MIN_NUMBER..MAX_NUMBER).random()
    var counter = NUMBER_OF_ATTEMPTS

    while (counter > ZERO_ATTEMPTS) {
        print("Введите число от $MIN_NUMBER до $MAX_NUMBER: ")
        val userNumber = readln().toInt()
        counter--
        if (userNumber != hiddenNumber && counter <= ZERO_ATTEMPTS) {
            println("Вы исчерпали все свои попытки, было загадано число $hiddenNumber")
        } else if (userNumber == hiddenNumber) {
            println("Это была великолепная игра!")
            break
        } else println("Вы ошиблись, осталось попыток: $counter")

    }
}