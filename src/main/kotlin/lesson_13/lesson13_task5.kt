package lesson_13

fun main() {
    print("Введите имя: ")
    val name = readln()

    print("Введите номер телефона: ")
    val phone = readln().toLongOrNull()

    if (phone == null) {
        println("Ошибка: NumberFormatException. Программа остановлена")
        return
    }

    print("Введите компанию: ")
    val company = readln()

    val phoneBook = listOf(
        ContactInfo(name, phone, company)
    )

    phoneBook.forEach { contact -> contact.printContact() }
}

data class ContactInfo(
    val name: String,
    val phone: Long,
    val company: String? = null,
) {
    fun printContact() {
        println(
            """
            Имя: $name
            Номер: $phone
            Компания: $company
            
            """.trimIndent()
        )
    }
}