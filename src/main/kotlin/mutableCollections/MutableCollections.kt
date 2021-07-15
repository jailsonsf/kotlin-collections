package mutableCollections

import collections.Employee

fun main() {
    val maria = Employee("Maria", 3000.0, "PJ")
    val joao = Employee("João", 1000.0, "CLT")
    val pedro = Employee("Pedro", 2000.0, "CLT")

    val employee1 = mutableListOf(joao, pedro)
    employee1.forEach { println(it) }

    println("=======================")
    employee1.add(maria)
    employee1.forEach { println(it) }

    println("=======================")
    employee1.remove(joao)
    employee1.forEach { println(it) }

    println("=========== SET ============")
    val employeeSet = mutableSetOf(joao)
    employeeSet.add(pedro)
    employeeSet.add(maria)
    employeeSet.remove(pedro)
    employeeSet.forEach { println(it) }
}