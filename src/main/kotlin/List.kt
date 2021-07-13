fun main() {
    val maria = Employee("Maria", 3000.0, "PJ")
    val joao = Employee("João", 1000.0, "CLT")
    val pedro = Employee("Pedro", 2000.0, "CLT")

    val employees = listOf(maria, joao, pedro)
    employees.forEach { println(it) }

    println("=======================")
    employees
        .sortedBy { it.salary }
        .forEach { println(it) }

    println("=======================")
    employees
        .groupBy { it.typeHiring }
        .forEach { println(it) }
}