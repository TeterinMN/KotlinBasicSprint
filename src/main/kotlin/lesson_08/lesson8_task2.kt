package lesson_08

fun main() {
    val ingredientsArray = arrayOf("окунь", "цукини", "апельсин", "масло", "петрушка")
    print("Введите название искомого ингредиента: ")
    val userInput = readln()

    for (i in ingredientsArray) {
        if (i == userInput) {
            println("Ингредиент $i в рецепте есть")
            return
        }
    }
    println("Нет такого ингредиента")
}