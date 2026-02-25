package lesson_03

fun main () {
    var lastName = "Андреева"
    val firstName = "Татьяна"
    val patronymic = "Сергеевна"
    var age = 20
    println("$lastName $firstName $patronymic, $age")

    age = 22
    lastName = "Сидорова"
    println("$lastName $firstName $patronymic, $age")

}