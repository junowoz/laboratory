fun smores() {
    println("Roast a marshmallow.")
    println("Place marshmallow on a graham cracker.")
    println("Place chocolate on marshmallow.")
    println("Put a new graham cracker on chocolate.")
    println("Enjoy!")
}

fun getSpeed(distance: Int, time: Int) {
    var speed = distance / time
    println("$speed meters per second")
}

fun getPrice(price: Double, couponCode: String = "None") {
    var finalPrice: Double
    if (couponCode == "save15") {
        finalPrice = price * .85
    } else {
        finalPrice = price
    }
    println("The total price is $finalPrice")
}

fun ozToTsp(oz: Double): Double{
    var tsp = oz * 6
    return tsp
}

fun pyramidVolume(l: Int, w: Int, h: Int) = (l * w * h) / 3

fun main() {

    smores() // Calling a function

    getSpeed(10,3) // Arguments

    getPrice(48.0, "save15") // Named and Default Arguments

    // Return Statements
    var tspNeeded = ozToTsp(0.75)
    println("You will need $tspNeeded tsp of vanilla extract for this recipe.")

    // Single Expression Functions
    var length = 5
    var width = 8
    var height = 14

    var volume = pyramidVolume(length, width, height)
    println("The volume of this pyramid is $volume.")

    // Function Literals: Anonymous Function
    var area = fun(base: Int, height: Int): Int{
        return (base * height) / 2
    }
    println(area(15,19))

    // Function Literals: Lambda Function
    var perimeter = {side1: Int, side2: Int -> (side1 + side2) * 2}
    println(perimeter(15,24))
}