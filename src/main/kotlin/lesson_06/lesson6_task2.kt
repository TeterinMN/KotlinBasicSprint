package lesson_06

const val STOP_TIMER = 0
const val TIMER_DELAY = 1000
const val COUNTER = 0

fun main() {
	print("Введите количество секунд таймера: ")
	var timerSeconds = readln().toInt()
	var counter = COUNTER

	while (timerSeconds > STOP_TIMER) {
		Thread.sleep(TIMER_DELAY.toLong())
		--timerSeconds
		counter ++
	}
	println("Прошло $counter секунд")
}