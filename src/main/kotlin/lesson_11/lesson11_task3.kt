package lesson_11

fun main() {
    val socialRoom = SocialNetworkRoom("Общество", "cover_image.png")
    val user1 = Participant("Scorpio", "eagle", "Свободен")
    val user2 = Participant("Lion", "lion", "Разговаривает по телефону")
    socialRoom.addUser(user1)
    socialRoom.addUser(user2)
    println(socialRoom.printData())
    socialRoom.setStatus("Lion", "пользователь заглушен")
    println(socialRoom.printData())
    socialRoom.setStatus("Орёл", "Свободен")

}

class SocialNetworkRoom(
    val title: String,
    val cover: String,
    val participants: MutableList<Participant> = mutableListOf(),
) {

    fun addUser(participant: Participant) {
        println("Добавление пользователя в комнату")
        participants.add(participant)
    }

    fun setStatus(nickname: String, newStatus: String) {
        val user = participants.find { it.nickname == nickname }
        if (user != null) {
            user.status = newStatus
            println("Статус успешно изменен для пользователя ${user.nickname}")
        } else {
            println("Статус не подлежит изменению. Указанного пользователя не существует.")
        }
    }

    fun printData(): String {
        val users = participants.joinToString(", ") {
            "(${it.nickname}, Avatar: ${it.avatar}, Статус: ${it.status})"
        }
        return "Комната: $title, Обложка: $cover, Пользователи: $users"
    }
}

class Participant(
    val nickname: String,
    val avatar: String,
    var status: String,
)