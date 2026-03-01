package lesson_06

fun main() {
	print("Для регистрации в приложении придумайте логин: ")
	val userLogin = readln()
	print("Придумайте пароль: ")
	val userPasswd = readln()
	println("Поздравляю. Вы успешно зарегистрировались")

	while (true) {
		print("Для авторизации введите логин: ")
		val login = readln()
		if (userLogin == login) {
			print("Введите пароль: ")
			val passwd = readln()
			if (userPasswd == passwd) {
				println("Авторизация прошла успешно")
				break
			} else println("Пароль не верный")
		} else println("Нет такого пользователя")
	}
}