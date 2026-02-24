package lesson_03

fun main() {
    val incomingString = "D2-D4;0"

    val fromWhere = incomingString.substringBefore("-")
    val toWhere = incomingString.substringAfter("-").substringBefore(";")
    val moveNumber = incomingString.substringAfter(";").toInt()

    println("""
         $fromWhere 
         $toWhere 
         $moveNumber
    """.trimIndent())
}