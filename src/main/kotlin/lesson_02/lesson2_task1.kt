package lesson_02

fun main() {
    val studentOne = 3
    val studentTwo = 4
    val studentThree = 3
    val studentFour = 5

    val averageScore: Double = (studentOne + studentTwo +
            studentThree + studentFour).toDouble() / 4

    println("%.2f".format(averageScore))
}