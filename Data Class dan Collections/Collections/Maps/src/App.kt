fun main() {
    val capital = mapOf(
            "Jakarta" to "Indonesia",
            "London" to "England",
            "New Delhi" to "India"
    )

    println(capital["Jakarta"])
    println(capital.getValue("New Delhi"))

    val mapKeys = capital.keys
    val mapValues = capital.values

    println(mapKeys)
    println(mapValues)
}