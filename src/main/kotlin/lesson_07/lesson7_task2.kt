package lesson_07

fun main() {
    val rangeNumber = (1000..9999)

    do {
        var randomNumber = rangeNumber.random()
        println("Ваш код авторизации: $randomNumber")
        print("Введите код авторизации: ")
        val userNumber = readln().toInt()
        if (randomNumber == userNumber) {
            println("Добро пожаловать")
        } else {
            randomNumber = rangeNumber.random()
        }
    } while (randomNumber != userNumber)

}