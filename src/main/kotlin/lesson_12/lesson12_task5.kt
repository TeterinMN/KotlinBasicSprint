package lesson_12

const val PERIOD_START_DAY = 1
const val PERIOD_END_DAY = 30

fun main() {
    val listWeather = mutableListOf<WeatherReport>()

    (PERIOD_START_DAY..PERIOD_END_DAY).forEach { _ ->
        listWeather.add(
            WeatherReport(
                dayTemperature = (0..35).random(),
                nightTemperature = (-10..20).random(),
                isPrecipitation = listOf(true, false).random()
            )
        )
    }
    val dayTemperature = listWeather.map { it.dayTemperature }.average().toInt()
    val nightTemperature = listWeather.map { it.nightTemperature }.average().toInt()
    val isPrecipitation = listWeather.count { it.isPrecipitation }

    println("Средняя дневная температура за $PERIOD_END_DAY дней: $dayTemperature °C")
    println("Средняя ночная температура за $PERIOD_END_DAY дней: $nightTemperature °C")
    println("Количество дней с осадками: $isPrecipitation")
}

class WeatherReport(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val isPrecipitation: Boolean,
) {
    init {
        printWeather()
    }

    fun printWeather() {
        println(
            """
            Дневная температура: $dayTemperature
            Ночная температура: $nightTemperature
            Осадки: $isPrecipitation
        """.trimIndent()
        )
    }

}