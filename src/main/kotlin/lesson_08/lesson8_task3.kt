package lesson_08

fun main() {
    val ingredientsArray = arrayOf("окунь", "цукини", "апельсин", "масло", "петрушка")
    print("Введите название искомого ингредиента: ")
    val userInput = readln()

    val resultFind = ingredientsArray.contains(userInput)
    if (resultFind) println("Ингредиент $userInput в рецепте есть")
    else println("Такого ингредиента в рецепте нет")
}