package lesson_09

const val LIMIT_INGREDIENTS = 5

fun main() {
    val ingredients = mutableListOf<String>()
    println("Введите $LIMIT_INGREDIENTS названий ингредиентов: ")
    var counter = 0
    while (ingredients.size < LIMIT_INGREDIENTS) {
        counter++
        print("$counter. ")
        ingredients.add(readln())
    }
    val sortIngredients = ingredients.sorted().toMutableList()
    sortIngredients[0] = sortIngredients[0].replaceFirstChar { it.uppercase() }

    println(sortIngredients.joinToString(", "))
}