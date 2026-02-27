package lesson_05

fun main() {
    val captchaLeftOperand = 87
    val captchaRightOperand = 13

    print("Подтвердите что вы не бот, решите пример $captchaLeftOperand + $captchaRightOperand = ")
    val userAnswer = readln().toInt()

    val result = if (userAnswer == captchaLeftOperand + captchaRightOperand) "Добро пожаловать!" else "Доступ запрещен."
    println(result)
}