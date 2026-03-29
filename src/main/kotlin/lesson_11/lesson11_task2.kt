package lesson_11

class User2 (
    var id: Int,
    var login: String,
    var password: String,
    var email: String,
    var bio: String = "",
) {
    fun printInfoUser() {
        println("ID: $id, login: $login, password: $password, email: $email, bio: $bio")
    }

    fun addInfoUser() {
        print("Укажите свой пол: ")
        bio = readln()
    }

    fun changePassword() {
        print("Введите текущий пароль: ")
        val answerUser = readln()
        if (password == answerUser) {
            print("Введите новый пароль: ")
            password = readln()
        } else println("Вы ошиблись. Программа завершена")
    }
}

fun main() {
    val user = User2(id = 1, login = "User", password = "Pass12345", email = "Kotlin@ru.ru")
    user.printInfoUser()
    user.addInfoUser()
    user.changePassword()
    user.printInfoUser()
}