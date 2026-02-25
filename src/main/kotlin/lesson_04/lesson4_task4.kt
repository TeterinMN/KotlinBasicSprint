package lesson_04

fun main() {
    val day = 5

    val armsWorkout = day
    val absWorkout = day
    val legsWorkout = day
    val backWorkout = day
    println(
        """
        Упражнение для рук:    ${armsWorkout % 2 == 1}
        Упражнения для ног:    ${legsWorkout % 2 != 1}
        Упражнения для спины:  ${backWorkout % 2 != 1}
        Упражнения для пресса: ${absWorkout % 2 == 1}
    """.trimIndent()
    )

}