package lesson_11

class User (
    var id: Int,
    var login: String,
    var password: String,
    var email: String,
)

fun main() {
    val user1 = User(1, "Scorpion", "pwd123", "user1@gmail.ru")
    val user2 = User(2, "Lion", "pwd321", "user2@gmail.ru")

    println("""
        Идентификатор пользователя = ${user1.id}
        Логин пользователя = ${user1.login}
        Пароль пользователя = ${user1.password}
        Email пользователя = ${user1.email}
    """.trimIndent())
    println()
    println("""
        Идентификатор пользователя = ${user2.id}
        Логин пользователя = ${user2.login}
        Пароль пользователя = ${user2.password}
        Email пользователя = ${user2.email}
    """.trimIndent())
}