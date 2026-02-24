package lesson_03

fun main() {
    var fromWhere = "E2"
    var toWhere = "E4"
    var moveNumber = 0
    val stringOfBlacks = "$fromWhere-$toWhere:${++moveNumber}"

    println(stringOfBlacks)

    fromWhere = "D2"
    toWhere = "D3"
    val stringOfWhite = "$fromWhere-$toWhere:${++moveNumber}"

    println(stringOfWhite)
}