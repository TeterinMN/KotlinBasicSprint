package lesson_06

fun main() {
    print("Для регистрации в приложении придумайте логин: ")
    val userLogin = readln()
    print("Придумайте пароль: ")
    val userPasswd = readln()
    println("Поздравляю. Вы успешно зарегистрировались")

    do {
        print("Для авторизации введите логин: ")
        val login = readln()
        print("Введите пароль: ")
        val passwd = readln()
    } while (login != userLogin || passwd != userPasswd)
        println("Авторизация прошла успешно")


//    while (true) {
//        print("Для авторизации введите логин: ")
//        val login = readln()
//        if (userLogin == login) {
//            print("Введите пароль: ")
//            val passwd = readln()
//            if (userPasswd == passwd) {
//                println("Авторизация прошла успешно")
//                break
//            } else println("Пароль не верный")
//        } else println("Нет такого пользователя")
//    }
}