package lesson_06

private const val STOP_TIMER = 0
private const val TIMER_DELAY = 1000

fun main() {
	print("Введите количество секунд таймера: ")
	var timerSeconds = readln().toInt()

	while (timerSeconds > STOP_TIMER) {
		println("Осталось секунд: $timerSeconds")
		Thread.sleep(TIMER_DELAY.toLong())
		--timerSeconds
	}
	println("""
		------
		Время вышло
	""".trimIndent())
}