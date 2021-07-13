fun main() {
    val names = Array(3){""}
    names[0] = "Zazá"
    names[1] = "Maria"
    names[2] = "José"

    names.sort()
    names.forEach { println(it) }

    val names2 = arrayOf("João", "Pedro")
    println("=======================")
    names2.forEach { println(it) }
}