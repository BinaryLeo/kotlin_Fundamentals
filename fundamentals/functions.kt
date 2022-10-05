package fundamentals

// Functions: A set of instructions bundled together to achieve a certain outcome
fun main() {
    sayHello()
    sum(1, 2)
    calculate(11,82)
}

fun sayHello() {
    println("Hello!")
}

fun sum(a: Int, b: Int) { // simple function using parameters
    println(a + b);
}

fun calculate(first: Int, second: Int) {
    for (i in first..second) {
        if (i % 2 == 0) {
            println("$i is multiple of 2")
        } else {
            println("$i is not multiple of 2")
        }


    }
}