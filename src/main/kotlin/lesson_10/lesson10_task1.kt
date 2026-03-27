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
    val humanDice = rollDice()
    val computerDice = rollDice()

    println("Человек выбросил: $humanDice")
    println("Компьютер выбросил: $computerDice")

    println(determineWinner(computerDice, humanDice))
}

fun rollDice(): Int = (1..6).random()

fun determineWinner(numberComputer: Int, numberHuman: Int): String {
    if (numberComputer == numberHuman) {
        return "Победила дружба"
    } else if (numberComputer < numberHuman) {
        return "Победило человечество"
    } else return "Победила машина"
}