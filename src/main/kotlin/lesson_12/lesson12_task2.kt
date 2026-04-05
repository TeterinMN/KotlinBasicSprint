package lesson_12

fun main() {
    val today = WeatherTwo(25.0, 20.0)
    val tomorrow = WeatherTwo(30.0, 15.0, true)

    today.printResult()
    tomorrow.printResult()
}

class WeatherTwo(
    var dayTemperature: Double,
    var nightTemperature: Double,
    var fallout: Boolean = false,
) {
    fun printResult() {
        println(
            """
            Дневная температура: $dayTemperature
            Ночная температура: $nightTemperature
            Осадки: $fallout
        """.trimIndent()
        )
    }
}