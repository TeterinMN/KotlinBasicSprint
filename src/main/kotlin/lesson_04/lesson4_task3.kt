package lesson_04

private const val IS_SUNNY = true
private const val IS_AWNING_OPEN = true
private const val AIR_HUMIDITY = 20
private const val SEASON = "Зима"

fun main() {
    val isSunny = true
    val isAwningOpen = true
    val awningHumidity = 20
    val seasonNow = "Зима"
    val result = (isSunny == IS_SUNNY) && (isAwningOpen == IS_AWNING_OPEN) &&
            (awningHumidity == AIR_HUMIDITY) && (seasonNow != SEASON)
    println("Благоприятные ли условия сейчас для роста бобовых? $result")
}
