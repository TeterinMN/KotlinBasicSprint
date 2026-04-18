package lesson_12

const val KELVIN_TO_CELSIUS = 273

fun main() {
    WeatherFour(280, 260, true)
}

class WeatherFour(
    var dayTempCelsius: Int,
    var nightTempCelsius: Int,
    var isPrecipitation: Boolean = false,
) {

    init {
        dayTempCelsius -= KELVIN_TO_CELSIUS
        nightTempCelsius -= KELVIN_TO_CELSIUS
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