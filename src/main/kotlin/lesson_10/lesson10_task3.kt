package lesson_10


fun main() {
    print("Введите длину пароля: ")
    val lengthPassword = readln().toInt()

    println(generatePassword(lengthPassword))
}

fun generatePassword(length: Int): String {
    val symbol = ' '..'/'
    val number = 0..9
    var password = ""
    for (i in 1..length) {
        password += if (i % 2 != 0) {
            number.random()
        } else symbol.random()
    }
    return password
}