package lesson_09

fun main() {
    print("Введите 5 названий ингредиентов, через запятую с пробелом: ")
    val inputUser = readln()

    val ingredients = inputUser.split(", ").toMutableList()
    val sortIngredients = ingredients.sorted()
    if (ingredients.size == 5) println(sortIngredients)
    else println("Вы ввели количество ингредиентов не равное 5")

}