package lesson_07

fun main() {
    print("Введите время таймера в секундах: ")
    val userInput = readln().toInt()
    var endTimer = userInput
    for (i in 1..userInput) {
        print("$endTimer ")
        Thread.sleep(1000)
        --endTimer
    }
    print("- Время вышло")
}