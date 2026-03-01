package lesson_06

const val STOP_TIMER = 0
const val TIMER_DELAY = 1000

fun main() {
	print("Введите количество секунд таймера: ")
	val timerSeconds = readln().toInt()

	if (timerSeconds > STOP_TIMER) {
		Thread.sleep(timerSeconds * TIMER_DELAY.toLong())
		println("Прошло $timerSeconds секунд")
	}
}