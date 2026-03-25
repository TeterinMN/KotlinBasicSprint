package lesson_10

/*
Напиши небольшую игру, в которой пользователь и компьютер по очереди бросают кости.
Побеждает выбросивший наибольшее число. Поочередно выводи сообщение о ходе игрока и компьютера
(отображать кто бросил, какие значения на кубиках);
 - Бросок кости вынеси в отдельную функцию, в которой генерируется случайное число от 1 до 6;
 - В отдельные переменные сохрани результат работы функции для игрока и компьютера;
 - После сравнения результатов, выведи соответствующее сообщение в консоль. Например: "Победило человечество",
"Победила машина" или "Победила дружба".
*/


fun main() {
    val humanDice = listOf(rollOfGameDice(), rollOfGameDice())
    val computerDice = listOf(rollOfGameDice(), rollOfGameDice())

    println("Человек выбросил: ${humanDice.joinToString { it.toString() }}")
    val resultHuman = countingTheThrow(humanDice[0], humanDice[1])

    println("Компьютер выбросил: ${computerDice.joinToString { it.toString() }}")
    val resultComputer = countingTheThrow(computerDice[0], computerDice[1])

    println(determiningTheWinner(resultComputer, resultHuman))
}

fun rollOfGameDice(): Int {
    return (1..6).random()
}

fun countingTheThrow(numberOne: Int, numberTwo: Int): Int {
    val result = numberOne + numberTwo
    return result
}

fun determiningTheWinner(numberComputer: Int, numberHuman: Int): String {
    if (numberComputer == numberHuman) {
        return "Победила дружба"
    } else if (numberComputer < numberHuman) {
        return "Победило человечество"
    } else return "Победила машина"
}