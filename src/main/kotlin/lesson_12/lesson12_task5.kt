package lesson_12

import kotlin.random.Random

const val PERIOD = 30

fun main() {
    val listWeather = List(PERIOD) {
        WeatherReport(
            dayTemperature = (0..35).random(),
            nightTemperature = (-10..20).random(),
            isPrecipitation = Random.nextBoolean(),
        )
    }
    val dayTemperature = listWeather.map { it.dayTemperature }.average().toInt()
    val nightTemperature = listWeather.map { it.nightTemperature }.average().toInt()
    val daysWithPrecipitation = listWeather.count { it.isPrecipitation }

    println("Средняя дневная температура за $PERIOD дней: $dayTemperature °C")
    println("Средняя ночная температура за $PERIOD дней: $nightTemperature °C")
    println("Количество дней с осадками: $daysWithPrecipitation")
}

class WeatherReport(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val isPrecipitation: Boolean,
)