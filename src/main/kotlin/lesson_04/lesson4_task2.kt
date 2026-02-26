package lesson_04

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100

fun main() {
    val cargoWeight = 50
    val cargoVolume = 100

    println(
        "Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average':" + "${
            (cargoWeight > MIN_WEIGHT) && (cargoWeight <= MAX_WEIGHT) && (cargoVolume < MAX_VOLUME)
        }"
    )
}