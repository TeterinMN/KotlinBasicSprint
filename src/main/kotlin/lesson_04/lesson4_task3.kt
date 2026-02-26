package lesson_04

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val AIR_HUMIDITY = 20
const val SEASON = "Зима"

fun main() {
    val isSunny = true
    val isAwningOpen = true
    val awningHumidity = 20
    val seasonNow = "Зима"
    val result = (isSunny == IS_SUNNY) && (isAwningOpen == IS_AWNING_OPEN) &&
            (awningHumidity == AIR_HUMIDITY) && (seasonNow != SEASON)
    println("Благоприятные ли условия сейчас для роста бобовых? $result")
}
