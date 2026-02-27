package lesson_05

import java.util.Calendar

const val LEGAL_ADULT_AGE = 18
fun main() {
	val currentYear = Calendar.getInstance().get(Calendar.YEAR)

	print("Введите год своего рождения: >> ")
	val userAnswer = readln().toInt()
	val result = if (currentYear - userAnswer >= LEGAL_ADULT_AGE) "Показать экран со скрытым контентом"
	else "Доступ запрещен"
	println(result)
}