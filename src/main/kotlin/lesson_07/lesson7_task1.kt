package lesson_07

fun main() {
    val numberRange = (0 until  10)
    val charRange = ('a'..'z')
    val rangePasswdLength = 1..3
    var passwd = ""

    for (i in rangePasswdLength ) {
        passwd += charRange.random().toString() + numberRange.random().toString()

    }
    println("Сгенерированный пароль: $passwd")
}