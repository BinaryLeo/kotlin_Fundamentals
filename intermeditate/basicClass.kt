package intermeditate

fun main() {
    val car = Car()//New instance of Car
    println(car.color  +  car.model)
    car.drive()
}

class Car {
    var color: String = "white "
    var model: String = "ZMD"
    fun drive(){
        println(this.color +  this.model  +  " makes vroooom when you drive")
    }

}

