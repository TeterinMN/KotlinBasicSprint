package lesson_04

const val SUNNY_WITHER = true
const val AWNING_OPEN = true
const val AIR_HUMIDITY = 20
const val SEASON = "Зима"

fun main() {
    val todayWeather = true
    val isAwningOpenNow = true
    val awningHumidity = 20
    val seasonNow = "Зима"
    val result =
        (todayWeather == SUNNY_WITHER) && (isAwningOpenNow == AWNING_OPEN) && (awningHumidity == AIR_HUMIDITY) && (seasonNow != SEASON)
    println("Благоприятные ли условия сейчас для роста бобовых? $result")
}
