package lesson_09

fun main() {
    val ingredients = mutableListOf("курица", "картофель", "лук")
    println("В рецепте есть базовые ингредиенты: $ingredients")

    print("Желаете добавить еще? ")
    val userAnswer = readln()
    if (userAnswer.equals("да", ignoreCase = true)) {
        print("Какой ингредиент вы хотите добавить? ")
        ingredients.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты: $ingredients")
    }
}