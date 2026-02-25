package lesson_02
const val MINUTES_IN_HOUR = 60
fun main() {
    val departureHour = 9
    val departureMinutes = 39
    val trainTravelTime = 457
    val timeMinutes = (departureHour * MINUTES_IN_HOUR) + departureMinutes
    val totalTimeMinutes = timeMinutes + trainTravelTime

    val arrivalHour = totalTimeMinutes / MINUTES_IN_HOUR
    val arrivalMinute = totalTimeMinutes % MINUTES_IN_HOUR

    println("%02d:%02d".format(arrivalHour, arrivalMinute))
}