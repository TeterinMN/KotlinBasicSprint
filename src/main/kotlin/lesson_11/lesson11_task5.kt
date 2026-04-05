package lesson_11

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("Михаил")
    val user2 = forum.createNewUser("Юлия")

    forum.createNewMessage(user1.userId, "Привет")
    forum.createNewMessage(user1.userId, "Меня зовут Михаил, Сегодня хорошая погода, не правда ли?")
    forum.createNewMessage(user2.userId, "Hello")
    forum.createNewMessage(user2.userId, "My name is Julia, and the weather is great.")

    forum.printThread()

}

class Forum {
    private val users = mutableListOf<ForumUser>()
    private val messages = mutableListOf<ForumMessage>()
    private var userIdCounter = 1

    fun createNewUser(userName: String): ForumUser {
        val user = ForumUser.Builder().setId(userIdCounter++).setUserName(userName).build()
        users.add(user)
        return user
    }

    fun createNewMessage(authorId: Int, message: String): ForumMessage {
        if (!users.any { it.userId == authorId }) {
            throw IllegalArgumentException("Пользователь с id=$authorId не найден")
        }
        val newMessage = ForumMessage.Builder().setAuthorId(authorId).setMessage(message).build()
        messages.add(newMessage)
        return newMessage
    }

    fun printThread() {
        for (message in messages) {
            val author = users.find { it.userId == message.authorId }
            println("${author?.userName}: ${message.message}")
        }
    }
}

class ForumUser(
    val userId: Int,
    val userName: String,
) {
    class Builder {
        var id: Int = 0
        var userName: String = ""
        fun setId(id: Int) = apply { this.id = id }
        fun setUserName(userName: String) = apply { this.userName = userName }

        fun build(): ForumUser {
            return ForumUser(id, userName)
        }
    }
}

class ForumMessage(
    val authorId: Int,
    val message: String,
) {
    class Builder {
        var id: Int = 0
        var message: String = ""
        fun setAuthorId(authorId: Int) = apply { this.id = authorId }
        fun setMessage(message: String) = apply { this.message = message }

        fun build(): ForumMessage {
            return ForumMessage(id, message)
        }
    }

}