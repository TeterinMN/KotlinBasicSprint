package lesson_02

fun main(args: Array<String>) {
    val employees = 50
    val interns = 30
    val employeesSalary = 30_000
    val internsSalary = 20_000

    val sumEmployeesSalary = employeesSalary * employees
    val totalSum = sumEmployeesSalary + (internsSalary * interns)
    val averageSalary = totalSum / (employees + interns)

    println(sumEmployeesSalary)
    println(totalSum)
    println(averageSalary)
}