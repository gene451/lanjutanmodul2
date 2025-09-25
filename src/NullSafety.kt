fun main(args: Array<String>) {
    var maybeNumber: Int? = 15
    println(maybeNumber?.times(2) ?: "Nilai null") // Output: 30

    maybeNumber = null
    println(maybeNumber?.times(2) ?: "Nilai null") // Output: Nilai null
}