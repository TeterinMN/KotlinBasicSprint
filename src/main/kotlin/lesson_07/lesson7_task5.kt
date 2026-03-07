package lesson_07

const val MIN_PASSWORD_LENGTH = 6
const val INITIAL_CHAR_SET = 3
const val LOOP_START = 1
fun main() {
    val numberRange = ('0'..'9')
    val charUppercaseRange = ('a'..'z')
    val charLowercaseRange = ('A'..'Z')

    val password = mutableListOf<Char>()
    password.add(numberRange.random())
    password.add(charUppercaseRange.random())
    password.add(charLowercaseRange.random())

    print("Введите длину пароля: ")
    var passwdLength = readln().toInt()

    while (passwdLength <= MIN_PASSWORD_LENGTH) {
        print("Длина пароля должна быть больше 6 символов: ")
        passwdLength = readln().toInt()
    }

    passwdLength -= INITIAL_CHAR_SET
    for (i in LOOP_START..passwdLength) password.add((numberRange + charUppercaseRange + charLowercaseRange).random())
    val resultPassword = password.shuffled().joinToString("")

    println("Сгенерированный пароль: $resultPassword")
}