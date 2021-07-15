package extensionsFunctions

fun main() {
    val salarys = arrayOf(
        "2000".toBigDecimal(),
        "2500".toBigDecimal(),
        "3500".toBigDecimal()
    )

    println(salarys.somatoria())

    println("=======================")
    println(salarys.media())
}