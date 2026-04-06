package lesson_12

fun main() {
    val today = Weather()
    val tomorrow = Weather()

    today.dayTemperature = 25.0
    today.nightTemperature = 20.0
    today.fallout = true

    tomorrow.dayTemperature = 30.0
    tomorrow.nightTemperature = 15.0
    tomorrow.fallout = false

    today.printResult()
    tomorrow.printResult()


}

class Weather {
    var dayTemperature: Double = 20.0
    var nightTemperature: Double = 10.0
    var fallout: Boolean = false

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