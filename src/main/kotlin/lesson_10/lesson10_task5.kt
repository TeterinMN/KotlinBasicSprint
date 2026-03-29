package lesson_10

/*
Реализуй механизм авторизации в интернет-магазине и получения сохраненного ранее списка товаров.

Метод авторизации принимает логин и пароль, верифицирует пользователя. Креды (credentials)
для входа сохрани в константы.

При успешной авторизации – метод генерирует и возвращает токен доступа. Токен - текстовая строка, генерируемая
методом авторизации (32 символа, которые включают цифры и буквы англ. алфавита – специальные библиотеки использовать
не нужно).

При неудачной авторизации метод возвращает null.

Метод получения корзины должен принимать токен и возвращать список товаров (строк) проинициализированных заранее.

Распечатай содержимое корзины или если вернется null оповести пользователя о неудачной авторизации. Переменные логин
и пароль для корректной авторизации проинициализированы заранее и неизменяемы.
 */

const val VALID_LOGIN = "user"
const val VALID_PASSWORD = "pass123"
const val TOKEN_LENGTH = 32

fun main() {
    print("Введите логин: ")
    val userLogin = readln()
    print("Введите пароль: ")
    val userPassword = readln()
    val token = authenticateUser(userLogin, userPassword).toString()
    println(getUserCart(token))
}

fun authenticateUser(login: String, password: String): String? {
    if (login == VALID_LOGIN && password == VALID_PASSWORD) {
        val uppercaseLetters = ('A'..'Z')
        val lowercaseLetters = ('a'..'z')
        val digits = ('0'..'9')
        var token = ""
        for (i in 1..TOKEN_LENGTH) {
            token += (uppercaseLetters + lowercaseLetters + digits).random()
        }
        return token
    }
    return null
}

fun getUserCart(token: String?): String {
    val cart = listOf("Корпус", "Блок питания", "Материнская плата", "Видеокарта")
    if (token == "null") return "Ошибка аутентификации"
    return cart.joinToString(", ")
}