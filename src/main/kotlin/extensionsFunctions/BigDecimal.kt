package extensionsFunctions

import java.math.BigDecimal

fun Array<BigDecimal>.somatoria() = this.reduce {
    acc, value -> acc + value
}

fun Array<BigDecimal>.media() =
    if (this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()