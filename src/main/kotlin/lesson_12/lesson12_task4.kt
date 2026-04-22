package lesson_12

const val KELVIN_TO_CELSIUS = 273

fun main() {
    WeatherFour(230, 228, true)
}

class WeatherFour(
    dayTempKelvin: Int,
    nightTempKelvin: Int,
    val isPrecipitation: Boolean = false,
) {
    val dayTempCelsius = dayTempKelvin - KELVIN_TO_CELSIUS
    val nightTempCelsius = nightTempKelvin - KELVIN_TO_CELSIUS

    init {
        printResult()
    }

    fun printResult() {
        println(
            """
            Дневная температура: $dayTempCelsius
            Ночная температура: $nightTempCelsius
            Осадки: $isPrecipitation
        """.trimIndent()
        )
    }
}