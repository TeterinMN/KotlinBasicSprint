package lesson_12

fun main() {
    val today = WeatherThree(300, 220, true)
    today.printResult()

}

class WeatherThree(dayTempKelvin: Int, nightTempKelvin: Int, hasPrecipitation: Boolean) {
    var dayTempCelsius = dayTempKelvin - 273
    var nightTempCelsius = nightTempKelvin - 273
    var isPrecipitation = hasPrecipitation

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