package lesson_10

/*
Для регистрации в приложении пользователь придумывает логин и пароль. И логин, и пароль должны содержать в себе хотя бы
4 символа. Если всё верно, программа выводит приветственное сообщение.
 - считывай логин и пароль с консоли поочередно;
 - вынеси в отдельную функцию валидацию длины введенных данных;
 - если логин или пароль меньше 4 символов – вывести сообщение: "Логин или пароль недостаточно длинные".
 */

const val LENGTH_USERNAME_PASSWORD = 4

fun main() {
    println("Для регистрации в приложении придумайте логин и пароль")
    print("Логин: ")
    val userName = readln()
    print("Пароль: ")
    val userPassword = readln()

    if (checkPasswordLength(userName, userPassword)) {
        println("Добро пожаловать")
    } else println("Логин или пароль недостаточно длинные")
}

fun checkPasswordLength(name: String, password: String): Boolean {
    return !(name.length < LENGTH_USERNAME_PASSWORD || password.length < LENGTH_USERNAME_PASSWORD)
}