class Book {
    // Creating a Class and assigning properties to it
    var pages = 320
    var title = "Harry Potter and the Sorcerer's Stone"
    var author = "J.K. Rowling"
}

class Building {

    // Class in: Creating an Instance
    val yearBuilt = 2016
    val height = 400 // Feet
    val type = "Limestone"
}

class Person(val name: String, val age: Int, val favoriteColor: String){
    // Primary Constructor
}

class Employee(val firstName: String, val lastName: String, val yearsWorked: Int) {
    // Init Block
    var fullName = firstName + " " + lastName
    init {
        if (yearsWorked > 1){
            println("$fullName is eligible for a raise!")
        } else {
            println("$fullName is not eligible for a raise just yet.")
        }
    }

}

class Dog(val name: String, val breed: String, val competitionsParticipated: List<String>) {
    // Member Functions
    init {
        for (comp in competitionsParticipated) {
            println("$name participated in $comp.")
        }
    }

    fun speak(){
        println("$name says: Woof!")
    }


}

fun main() {

    // Creating an Instance
    val residentialBuilding = Building()
    println(residentialBuilding.yearBuilt)
    println(residentialBuilding.height)
    println(residentialBuilding.type)

    // Primary Constructor
    var me = Person("Juan", 20, "Gray")
    var myFriend = Person("Jose", 21, "Black")
    println("${me.name} is ${me.age} years old and his favorite color is ${me.favoriteColor}.")
    println("${myFriend.name} is ${myFriend.age} years old and his favorite color is ${myFriend.favoriteColor}.")

    // Init Block
    var projectManager = Employee("Maria", "Gonzalez", 2)

    // Member Functions
    var maxie = Dog("Maxie", "Poodle", listOf("Westminster Kennel Club Dog Show", "AKC National Championship"))
    maxie.speak()

}