package lesson_13

fun main() {
    val contacts = listOf(
        ContactInfo("Михаил", 89963153333, "Rubi-com"),
        ContactInfo("Юлия", 89147777777),
        ContactInfo("Елизавета", 89249248888),
        ContactInfo("Светлана", 89069109999, "Аксиома"),
        ContactInfo("Тимур", 89139137333, "null"),
    )

    val company = contacts.mapNotNull { it.company }
    println("СПИСОК КОМПАНИЙ:\n${company.joinToString(",\n")}")
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