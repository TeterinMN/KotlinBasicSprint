package lesson_02

fun main() {
    val departureHour = 9
    val departureMinutes = 39
    val trainTravelTime = 457
    val timeMinutes = (departureHour * 60) + departureMinutes
    val totalTimeMinutes = timeMinutes + trainTravelTime

    val arrivalHour = totalTimeMinutes / 60
    val arrivalMinute = totalTimeMinutes % 60

    println(("$arrivalHour:$arrivalMinute").padStart(2, '0'))
}