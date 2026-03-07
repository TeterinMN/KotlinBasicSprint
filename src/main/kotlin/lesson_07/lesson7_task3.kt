package lesson_07

fun main() {
    print("Введите конечное число: ")
    val userNumber = readln().toInt()
    val rangeNumber = 0..userNumber step 2

    for (i in rangeNumber) {
        print("$i ")
    }
}