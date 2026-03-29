package lesson_11

fun main() {
    val socialRoom = SocialNetworkRoom("Общество", "Картинка", listUser = mutableListOf("Scorpio"))
    println(socialRoom.printData())

    socialRoom.addUser()
    println(socialRoom.printData())

    socialRoom.setStatus()
    println(socialRoom.printData())
}

class SocialNetworkRoom(
    val title: String,
    val cover: String,
    var status: String = "",
    val listUser: MutableList<String> = mutableListOf()
) {

    fun addUser() {
        println("Добавление пользователя в комнату")
        print("Придумайте ник: ")
        listUser.add(readln())
    }

    fun setStatus() {
        print("Введите пользователя для смены статуса: ")
        val answerUser = readln()
        if (answerUser in listUser) {
            print("Установить статус: ")
            status = readln()
        } else println("Нет такого пользователя")
    }

    fun printData(): String {
        return  "Комната: $title, Обложка: $cover, Статус: $status, Пользователи: ${listUser.joinToString(", ")}"
    }
}