package lesson_05

const val MIN_VALUE = 0
const val MAX_VALUE = 42
fun main() {
    val numberOne = 5
    val numberTwo = 17

    print("Введите первое целое число от $MIN_VALUE до $MAX_VALUE: > ")
    val userNumberOne = readln().toInt()

    print("Введите второе целое число от $MIN_VALUE до $MAX_VALUE: > ")
    val userNumberTwo = readln().toInt()

    if ((userNumberOne == numberOne && userNumberTwo == numberTwo) || (userNumberOne == numberTwo && userNumberTwo == numberOne)) println(
        "Поздравляем! Вы выиграли главный приз!"
    )
    else if ((userNumberOne == numberOne || userNumberTwo == numberTwo) || (userNumberOne == numberTwo || userNumberTwo == numberOne)) println(
        "Вы выиграли утешительный приз!"
    ) else println("Неудача")
    println("Выигрышные числа $numberOne и $numberTwo")
}