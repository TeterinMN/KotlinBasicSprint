package lesson_04

const val RESTAURANT_TABLES = 13
fun main() {
    val bookingToday = 13
    val bookingTomorrow = 9

    println("Доступность столиков на сегодня: ${bookingToday < RESTAURANT_TABLES}\n" +
            "Доступность столиков на завтра: ${bookingTomorrow < RESTAURANT_TABLES}")
}