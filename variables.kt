import java.lang.reflect.Type

fun main(){
    var name = "Kotlin" // Mutable.
    name = "Jetpack Compose" //var can be assigned multiple times.
    val myName = "BinaryLeo" // Immutable.
    //myName = "Another User" // Error -> Val cannot be reassigned.
    println("Hello World $name!")
    println("Welcome $myName!")

    //Initializing variables:
    var age: Int = 38 // Explicitly given type is redundant here
    println( "$myName has $age years old!")


    //Variables types
    val user = "James" //String
    val Age = 38 //Int
    val temperature =  28.5

    //Get types
    println("Temperature has a " + temperature.javaClass.kotlin.simpleName.toString().lowercase() + " type!")
    println("user has a " + user.javaClass.kotlin.simpleName.toString().lowercase() + " type!")
}