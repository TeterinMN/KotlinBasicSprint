package lesson_05

fun main() {
	val captcha = 87 + 13
	val captchaText = "87 + 13"

	print("Подтвердите что вы не бот, решите пример $captchaText = ")
	val userAnswer = readln().toInt()

	val result = if (userAnswer == captcha) "Добро пожаловать!" else "Доступ запрещен."
	println(result)
}