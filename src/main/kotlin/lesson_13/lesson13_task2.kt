package lesson_13

fun main() {
    val addUser1 = ContactInfo("Юлия", 89963153333)
    val addUser2 = ContactInfo("Михаил", 89963153333, "Rubi-com")

    addUser1.printContact()
    addUser2.printContact()
}

class ContactInfo(
    val name: String,
    val phone: Long,
    val company: String?,
) {
    constructor(name: String, phone: Long) : this(name, phone, null)

    fun printContact() {
        println("Имя: $name\nНомер: $phone\nКомпания: ${company ?: "<не указано>"}\n------------------------------")
    }
}