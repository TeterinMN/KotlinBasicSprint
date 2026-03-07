package lesson_04

private const val DAMAGE = false
private const val PROVISIONS = 50
private const val MIN_CREW = 55
private const val MAX_CREW = 70
private const val FAVORABLE_WEATHER = true
fun main() {
    print("Наличие повреждений корпуса (true/false): ")
    val damage = readln().toBoolean()
    print("Текущий состав экипажа: ")
    val crew = readln().toInt()
    print("Количество ящиков с провизией: ")
    val provisions = readln().toInt()
    print("Благоприятность метеоусловий (true/false): ")
    val favorableWeather = readln().toBoolean()

    val result =
        (damage == DAMAGE && favorableWeather == FAVORABLE_WEATHER) &&
                (crew >= MIN_CREW && crew <= MAX_CREW) && (provisions > PROVISIONS) ||
                (damage != DAMAGE && favorableWeather == FAVORABLE_WEATHER) && (crew == MAX_CREW && provisions >= PROVISIONS)

    println(result)

}