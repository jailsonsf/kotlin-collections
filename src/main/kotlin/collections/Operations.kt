package collections

fun main() {
    val prices = doubleArrayOf(10.0, 12.5, 20.9)

    println("Maior preço: ${prices.maxOrNull()}")
    println("Menor preço: ${prices.minOrNull()}")
    println("Media: ${prices.average()}")

    println("=======================")
    val priceBiggerThan10 = prices.filter { it > 10.0 }
    priceBiggerThan10.forEach { println(it) }

    println("=======================")
    println(prices.count { it in 12.0..25.0 })

    println("=======================")
    println(prices.find { it == 12.5 })
    println(prices.find { it == 15.0 }) // null

    println("=======================")
    println(prices.any { it == 12.5 })
    println(prices.any { it == 15.0 }) // null
}