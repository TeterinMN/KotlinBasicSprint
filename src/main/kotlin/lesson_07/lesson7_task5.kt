package lesson_07

fun main() {
    val numberRange = (0 until 10)
    val charUppercaseRange = ('a'..'z')
    val charLowercaseRange = ('A'..'Z')
    var result = ""

    print("Введите длину пароля: ")
    var passwdLength = readln().toInt()

    while (passwdLength <= 6) {
        print("Длина пароля должна быть больше 6 символов: ")
        passwdLength = readln().toInt()
    }
    val range = 0 until passwdLength
    for (i in range)
        result += (charUppercaseRange.random() + numberRange.random().toString() + charLowercaseRange.random()).random()
    println("Сгенерированный пароль: $result")
}