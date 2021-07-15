package collections

fun main() {
    val maria = Employee("Maria", 3000.0, "PJ")
    val joao = Employee("João", 1000.0, "CLT")
    val pedro = Employee("Pedro", 2000.0, "CLT")

    val employee1 = setOf(joao, pedro)
    val employee2 = setOf(maria)

    val resultUnion = employee1.union(employee2)
    resultUnion.forEach { println(it) }

    println("=======================")
    val employee3 = setOf(maria, joao, pedro)
    val resultSubtract = employee3.subtract(employee2)
    resultSubtract.forEach { println(it) }

    println("=======================")
    val resultIntersect = employee3.intersect(employee2)
    resultIntersect.forEach { println(it) }
}