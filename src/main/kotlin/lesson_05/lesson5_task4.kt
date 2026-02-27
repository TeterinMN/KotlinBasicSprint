package lesson_05

const val USER_LOGIN = "Zaphod"
const val USER_PASSWORD = "PanGalactic"

fun main() {
	print("Введите ваш логин: ")
	val userLogin = readln()

	val loginCheck = when {
		userLogin == USER_LOGIN -> {
			print("Введите ваш пароль: ")
			val userPassword = readln()
			if (userPassword == USER_PASSWORD) "Добро пожаловать"
			else "Пароль не верный"
		}

		else -> "Зарегистрируйтесь пожалуйста"
	}
	println(loginCheck)

}