package lesson_13

fun main() {
    val addUser1 = ContactInfo_task2("Юлия", 89963153333)
    val addUser2 = ContactInfo_task2("Михаил", 89963153333, "Rubi-com")

    addUser1.printContact()
    addUser2.printContact()
}

class ContactInfo_task2(
    val name: String,
    val phone: Long,
    val company: String? = null,
) {

    fun printContact() {
        println("Имя: $name\nНомер: $phone\nКомпания: ${company ?: "<не указано>"}\n------------------------------")
    }
}