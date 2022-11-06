package fundamentals

fun main() {
    val myCharSet = setOf("luke", "leo", "lionel")//immutable
    println(myCharSet)

    val myListOfValues = mutableSetOf("lui","Greg")//mutable
    myListOfValues.add("Stuart")
    println(myListOfValues)
}