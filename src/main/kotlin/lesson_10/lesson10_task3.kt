package lesson_10


fun main() {
    print("Введите длину пароля: ")
    val lengthPassword = readln().toInt()
    println(passwordGeneration(lengthPassword))
}

fun passwordGeneration(length: Int): String {
    val symbol = ('!'..'/') + ' '
    val number = 0..9
    var password = ""
    for (i in 1..length step 2) {
        password += number.random().toString() + symbol.random().toString()
    }
    if (length % 2 != 0) {
        password = password.dropLast(1)
    }
    return password
}