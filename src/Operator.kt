fun main(args: Array<String>) {
    var maybeNumber: Int? = 15
    maybeNumber = null
    println(maybeNumber?.times(2)) // Safe call: null

    var s1 = "Hello"
    var s2: String? = "World"
    println(s1.length) // 5
    println(s2?.length) // Safe call: 5
}