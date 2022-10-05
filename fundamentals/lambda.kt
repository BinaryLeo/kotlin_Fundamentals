package fundamentals

fun main(){
println(sum(2,3))
}

//Lambda expression is a shorter way of describing a function
val sum:(Int,Int)-> Int = {a,b->a+b}
//---1-|-----------2------|-3--|--4-|
//variable| ---- type ----| params | body|