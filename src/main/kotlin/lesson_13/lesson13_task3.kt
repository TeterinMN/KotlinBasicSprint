package lesson_13

fun main() {
    val contacts = listOf(
        ContactInfo_task3("Михаил", 89963153333, "Rubi-com"),
        ContactInfo_task3("Юлия", 89147777777),
        ContactInfo_task3("Елизавета", 89249248888),
        ContactInfo_task3("Светлана", 89069109999, "Аксиома"),
        ContactInfo_task3("Тимур", 89139137333, "null"),
    )

    val phoneBookCompanies = contacts.mapNotNull { it.company }
    println("СПИСОК КОМПАНИЙ:\n${phoneBookCompanies.joinToString(",\n")}")
}

class ContactInfo_task3(
    val name: String,
    val phone: Long,
    val company: String? = null,
) {

    fun printContact() {
        println("Имя: $name\nНомер: $phone\nКомпания: ${company ?: "<не указано>"}\n------------------------------")
    }
}