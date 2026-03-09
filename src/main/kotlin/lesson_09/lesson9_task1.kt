package lesson_09

fun main() {
    val ingredients = mutableListOf("курица", "картофель", "морковь", "лук", "масло")
    println("В рецепте есть следующие ингредиенты: $ingredients")

    ingredients.forEach { println(it) }
}