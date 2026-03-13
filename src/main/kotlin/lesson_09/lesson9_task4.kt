package lesson_09

const val INGREDIENTS_COUNT = 5

fun main() {
    print("Введите $INGREDIENTS_COUNT названий ингредиентов, через запятую с пробелом: ")
    val inputUser = readln()

    val ingredients = inputUser.split(", ").toMutableList()
    val sortIngredients = ingredients.sorted()
    if (ingredients.size == INGREDIENTS_COUNT) println(sortIngredients)
    else println("Вы ввели количество ингредиентов не равное $INGREDIENTS_COUNT")

}