fun main() {
    val values = IntArray(5)
    values[0] = 10
    values[1] = 6
    values[2] = 7
    values[3] = 3
    values[4] = 9

    for (value in values) {
        println(value)
    }

    println("=======================")
    for (index in values.indices) {
        println(values[index])
    }

    println("=======================")
    val numbersPositives = intArrayOf(2, 4, 6, 8)
    numbersPositives.forEach { println(it) }
}