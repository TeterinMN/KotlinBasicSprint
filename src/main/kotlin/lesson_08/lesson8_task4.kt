package lesson_08

fun main() {
    val ingredientsArray = arrayOf("окунь", "цукини", "апельсин", "масло", "петрушка")
    println(ingredientsArray.contentToString())

    print("Введите название ингредиента который необходимо заменить: ")
    val userInput = readln()
    val resultFind = ingredientsArray.contains(userInput)
    val indexFind = ingredientsArray.indexOf(userInput)
    if (resultFind) {
        print("Введите название нового ингредиента: ")
        val newIngredients = readln()
        ingredientsArray[indexFind] = newIngredients
        println("Готово! Вы сохранили следующий список: ${ingredientsArray.contentToString()}")
    } else println("Такого ингредиента в рецепте нет")

}