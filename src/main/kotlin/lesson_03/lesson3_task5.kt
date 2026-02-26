package lesson_03

fun main() {
    val incomingString = "D2-D4;0"
    val (fromWhere, toWhere, moveNumber) = incomingString.split('-', ';', limit = 3)

    println(
        """
         $fromWhere 
         $toWhere 
         $moveNumber
    """.trimIndent()
    )
}