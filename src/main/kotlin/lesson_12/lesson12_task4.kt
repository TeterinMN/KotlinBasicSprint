package lesson_12

const val KELVIN_TO_CELSIUS = 273

fun main() {
    WeatherFour(280, 260, true)
}

class WeatherFour(
    var dayTempKelvin: Int,
    var nightTempKelvin: Int,
    var isPrecipitation: Boolean = false,
) {

    init {
        dayTempKelvin -= KELVIN_TO_CELSIUS
        nightTempKelvin -= KELVIN_TO_CELSIUS
        printResult()
    }

    fun printResult() {
        println(
            """
            Дневная температура: $dayTempKelvin
            Ночная температура: $nightTempKelvin
            Осадки: $isPrecipitation
        """.trimIndent()
        )
    }
}