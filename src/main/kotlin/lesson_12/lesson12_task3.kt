package lesson_12

fun main() {
    val today = WeatherThree(300, 220, true)
    today.printResult()

}

class WeatherThree(dayTempKelvin: Int, nightTempKelvin: Int, hasPrecipitation: Boolean) {
    val dayTempCelsius = dayTempKelvin - 273
    val nightTempCelsius = nightTempKelvin - 273
    val isPrecipitation = hasPrecipitation

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