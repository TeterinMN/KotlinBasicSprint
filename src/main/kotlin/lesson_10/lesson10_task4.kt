package lesson_10

/*
Усовершенствуй игру, где пользователь и компьютер по очереди бросают кости. 
Побеждает выбросивший наибольшее число. Теперь дай возможность пользователю играть 
до тех пор, пока ему не надоест. В конце программа должна вывести сколько партий он 
выиграл.
 - после первого раунда программа задает вопрос: “Хотите бросить кости еще раз? 
   Введите Да или Нет”;
 - программа в зависимости от ответа запускает новый раунд или заканчивает игру с 
   выводом количества выигрышных партий человека;
 - в программе должно быть минимум 2 метода (для проведения раунда и для генерации 
   значений брошенных кубиков);
 - основная логика программы должна находиться в main(), а 2 другие функции будут 
   вспомогательными.
 */

fun main() {
    var humanWins = 0
    do {
        val humanDice = getRandomDiceValue()
        val computerDice = getRandomDiceValue()

        println("Человек выбросил: $humanDice")
        println("Компьютер выбросил: $computerDice")

        val result = resolveWinner(computerDice, humanDice)
        println(result)
        if (result == "Победило человечество") {
            humanWins++
        }

        print("Хотите бросить кости еще раз? (Введите Да или Нет): ")
        val answer = readln()
        if (answer.equals("Да", ignoreCase = true)) {
            continue
        } else if (answer.equals("Нет", ignoreCase = true)) {
            println("Спасибо за игру!")
            println("Вы выиграли $humanWins партий")
            break
        } else {
            println("Некорректный ввод. Пожалуйста, введите Да или Нет.")
        }
    } while (true)
}

fun getRandomDiceValue(): Int = (1..6).random()

fun resolveWinner(numberComputer: Int, numberHuman: Int): String {
    return if (numberComputer == numberHuman) {
        "Победила дружба"
    } else if (numberComputer < numberHuman) {
        "Победило человечество"
    } else "Победила машина"
}
