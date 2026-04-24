fun main() {
    val contacts = mutableListOf(
        ContactInfo("Михаил", "89963153333", "Rubi-com"),
        ContactInfo("Юлия", "89139137333"),
        ContactInfo("Елизавета", ""),
        ContactInfo("Светлана", "89249248888", "Аксиома"),
        ContactInfo("Тимур", "", "Яндекс"),
    )

    contacts.forEach { contact ->
        contact.printContact()
    }
}

data class ContactInfo(
    val name: String,
    val phone: String? = null,
    val company: String? = null,
) {
    fun printContact() {
        val checkedPhone = phone?.toLongOrNull()
        if (checkedPhone == null) {
            println("$name не ввел(а) номер телефона. Запись не добавлена.\n")
            return
        }
        println(
            """
            Имя: $name
            Номер: $phone
            Компания: $company
            
            """.trimIndent()
        )
    }
}