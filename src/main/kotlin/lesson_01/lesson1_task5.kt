package lesson_01

fun main(args: Array<String>) {
    val seconds = 6480
    val hours: Int
    val minutes: Int
    val remainingSeconds: Int
    val remainingMinutes: Int

    minutes = seconds / 60
    hours = minutes / 60
    remainingMinutes = minutes % 60
    remainingSeconds = seconds % 60

    println(
        "${hours.toString().padStart(2, '0')}:" +
                "${remainingMinutes.toString().padStart(2, '0')}:" +
                "${remainingSeconds.toString().padStart(2, '0')}"
    )
}