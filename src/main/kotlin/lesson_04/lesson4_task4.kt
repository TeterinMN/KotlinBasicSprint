package lesson_04

fun main() {
    val day = 5
    val isEven = day % 2 == 0
    println(
        """
        Упражнение для рук:    ${!isEven}
        Упражнения для ног:    ${isEven}
        Упражнения для спины:  ${isEven}
        Упражнения для пресса: ${!isEven}
    """.trimIndent()
    )

}