package lesson_06

const val MIN_NUMBER = 1
const val MAX_NUMBER = 9
const val CAPTCHA_ATTEMPTS_COUNT = 3
const val ZERO_ATTEMPTS = 0

fun main() {
    var counter = CAPTCHA_ATTEMPTS_COUNT

    do {
        counter--
        val captchaLeftOperand = (MIN_NUMBER..MAX_NUMBER).random()
        val captchaRightOperand = (MIN_NUMBER..MAX_NUMBER).random()
        val captchaResult = captchaLeftOperand + captchaRightOperand
        print("Подтвердите что вы не бот, решите пример $captchaLeftOperand + $captchaRightOperand = ")
        val userAnswer = readln().toInt()
        if (userAnswer == captchaResult) {
            println("Добро пожаловать!")
        } else if (counter != ZERO_ATTEMPTS) {
            println("Ответ не верный. У вас осталось попыток: $counter")
        } else {
            println("Доступ запрещен.")
            break
        }
    } while (userAnswer != captchaResult)

}