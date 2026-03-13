package lesson_09

const val LIMIT_INGREDIENTS = 5

fun main() {
    val ingredients = mutableSetOf<String>()
    println("Введите $LIMIT_INGREDIENTS названий ингредиентов: ")
    var counter = 1
    while (ingredients.size < LIMIT_INGREDIENTS) {
        print("$counter. ")
        val userInput = (readln().lowercase())
        if (ingredients.add(userInput)) {
            counter++
        } else println("Такой ингредиент уже есть")
    }
    val sortIngredients = ingredients.sorted().toMutableList()
    sortIngredients[0] = sortIngredients[0].replaceFirstChar { it.uppercase() }

    println(sortIngredients.joinToString(", "))
}