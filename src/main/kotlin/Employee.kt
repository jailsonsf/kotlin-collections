data class Employee(
    val name: String,
    val salary: Double,
    val typeHiring: String
) {
    override fun toString(): String =
        """
            Nome: $name
            Salário: $salary
        """.trimIndent()
}