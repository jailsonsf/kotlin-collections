fun main() {
    val prices = DoubleArray(3)
    prices[0] = 10.0
    prices[1] = 5.5
    prices[2] = 18.9

    prices.forEach { println(it) }

    println("=======================")
    prices.forEachIndexed {index, price ->
        prices[index] = price * 1.1
    }
    prices.forEach { println(it) }

    println("=======================")
    val salary = doubleArrayOf(1000.0, 1500.0, 3500.0)
    salary.sort()
    salary.forEach { println(it) }
}