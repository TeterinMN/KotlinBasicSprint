package lesson_08

fun main() {
    print("Введите количество ингредиентов: ")
    val sizeArray = readln().toInt()
    val ingredientsArray = Array(sizeArray) { "" }

    for (i in 0 until ingredientsArray.size) {
        print("Введите название ингредиента: ")
        val userInput = readln()
        ingredientsArray[i] = userInput
    }
    println("Готово! Вы сохранили следующий список: ${ingredientsArray.joinToString()}")
}