package lesson_09

fun main() {
    val numberOfIngredients = mutableListOf(2, 50, 15)
    print("Количество порций: ")
    val numberOfServings = readln().toInt()

    val resultIngredients = mutableListOf(
        "Яиц - ${numberOfIngredients[0] * numberOfServings}",
        "Молока - ${numberOfIngredients[1] * numberOfServings}",
        "Сливочного масла - ${numberOfIngredients[2] * numberOfServings}"
    )

    println("Для $numberOfServings порций вам понадобится: ${resultIngredients.joinToString(", ")}")
}


//    for (i in numberOfIngredients.indices) {
//        numberOfIngredients[i] = numberOfIngredients[i] * numberOfServings
//    }
// или
//    numberOfIngredients.replaceAll {it * numberOfServings}