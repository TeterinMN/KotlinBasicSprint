package lesson_06

const val MIN_NUMBER = 1
const val MAX_NUMBER = 9
const val NUMBER_OF_ATTEMPTS = 5

fun main() {
    val hiddenNumber = (MIN_NUMBER..MAX_NUMBER).random()
    println(hiddenNumber)

    var counter = NUMBER_OF_ATTEMPTS

    while (true) {
        counter--
        print("Введите число от $MIN_NUMBER до $MAX_NUMBER: ")
        val userNumber = readln().toInt()
        if (userNumber == hiddenNumber) {
            println("Это была великолепная игра!")
            break
        } else println("Вы ошиблись, осталось попыток: $counter")
        if (counter <= 0) {
            println("Вы исчерпали все свои попытки, было загадано число $hiddenNumber")
            break
        }
    }
}