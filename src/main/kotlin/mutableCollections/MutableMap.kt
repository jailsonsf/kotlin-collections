package mutableCollections

import collections.Employee

fun main() {
    val maria = Employee("Maria", 3000.0, "PJ")
    val joao = Employee("João", 1000.0, "CLT")
    val pedro = Employee("Pedro", 2000.0, "CLT")

    val repository = Repository<Employee>()
    repository.create(maria.name, maria)
    repository.create(joao.name, joao)
    repository.create(pedro.name, pedro)

    println(repository.findById(pedro.name))

    println("=======================")
    repository.findAll().forEach { println(it) }

    println("=======================")
    repository.remove(maria.name)
    repository.findAll().forEach { println(it) }
}