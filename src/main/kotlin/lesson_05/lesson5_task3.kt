package lesson_05

fun main() {
	val numberOne = 5
	val numberTwo = 17
	var userInput: String

	print("Введите первое целое число от 0 до 42: > ")
	userInput = readln()
	val userNumberOne = if (userInput.toInt() == numberOne || userInput.toInt() == numberTwo) userInput.toInt() else 0

	print("Введите второе целое число от 0 до 42: > ")
	userInput = readln()
	val userNumberTwo = if (userInput.toInt() == numberOne || userInput.toInt() == numberTwo) userInput.toInt() else 0

	if ((userNumberOne == numberOne && userNumberTwo == numberTwo) || (userNumberOne == numberTwo && userNumberTwo == numberOne))
		println("Поздравляем! Вы выиграли главный приз!")
	else if ((userNumberOne == numberOne || userNumberTwo == numberTwo) || (userNumberOne == numberTwo || userNumberTwo == numberOne))
		println("Вы выиграли утешительный приз!") else println("Неудача")
	println("Выигрышные числа $numberOne и $numberTwo")
}