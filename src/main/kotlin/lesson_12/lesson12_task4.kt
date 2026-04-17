package lesson_12

fun main() {
    WeatherFour(300, 220, true)
}

class WeatherFour() {
    var dayTempCelsius = 0
    var nightTempCelsius = 0
    var isPrecipitation = false

    constructor(dayTempKelvin: Int, nightTempKelvin: Int, isPrecipitation: Boolean) : this() {
        this.dayTempCelsius = dayTempKelvin - 273
        this.nightTempCelsius = nightTempKelvin - 273
        this.isPrecipitation = isPrecipitation
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