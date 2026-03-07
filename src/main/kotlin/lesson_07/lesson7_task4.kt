package lesson_07

fun main() {
    print("Введите время таймера в секундах: ")
    val userInput = readln().toInt()

    for (i in userInput downTo 1) {
        print("$i ")
        Thread.sleep(1000)
    }
    print("- Время вышло")
}