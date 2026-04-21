package lesson_13


fun main() {
    val phoneBook = Contact("Михаил", 89963153333)
    phoneBook.printContact()
}

class Contact(
    val name: String,
    val phone: Long,
    val company: String?,
) {
    constructor(name: String, phone: Long) : this(name, phone, null)

    fun printContact() {
        println(
            """
            Имя контакта: $name
            Номер телефона: $phone
            Компания: $company
        """.trimIndent()
        )
    }
}