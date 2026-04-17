package lesson_12

fun main() {
    val today = WeatherTwo(25.0, 20.0, false)
    val tomorrow = WeatherTwo(30.0, 15.0, true)

    today.printResult()
    tomorrow.printResult()
}

class WeatherTwo(
    val dayTemperature: Double,
    val nightTemperature: Double,
    val isPrecipitation: Boolean,
) {
    fun printResult() {
        println(
            """
            Дневная температура: $dayTemperature
            Ночная температура: $nightTemperature
            Осадки: $isPrecipitation
        """.trimIndent()
        )
    }
}