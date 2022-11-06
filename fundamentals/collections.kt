package fundamentals

fun main(){
// A collection usually contains a number of objects/items in a certain order of the same type.
//List / ArrayList/ ListOf()

val myListOfNames = listOf("Leonardo", "Luigi","Matteo")
    println(myListOfNames[1])
    for(item in myListOfNames){
        println("$item you are the index " + myListOfNames.indexOf(item) + " of our developers list" )
    }

val yourListOfNames = listOf("Jeremy", "Luke","Michel")
yourListOfNames.forEach {
    println(it)
}
}