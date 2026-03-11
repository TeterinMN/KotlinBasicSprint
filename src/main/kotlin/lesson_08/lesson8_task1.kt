package lesson_08

fun main() {
    val viewsArray = intArrayOf(0, 0, 0, 0, 0, 0, 0)
    val daysOfWeekArray = arrayOf("Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье")
    for (i in viewsArray.indices) {
        print("Введите количество просмотров в ${daysOfWeekArray[i]}: ")
        viewsArray[i] = readln().toInt()
    }
    val totalSum = viewsArray.sum()
    println("Количество просмотров за неделю: $totalSum")
}