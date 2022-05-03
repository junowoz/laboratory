fun main() {
    // If | If - Else
    var raining = true
    if (raining) {
        println("Bring an umbrella.")
    }

    if (raining) {
        println("Bring an umbrella.")
    } else {
        println("Don't bring an umbrella")
    }

    // Comparisions
    var d20 = 13

    if (d20 >= 17) {
        println("The incantation works and the dragon is defeated.")
    } else {
        println("The incantation fails and the dragon wins.")
    }

    // Equality and Inequality
    var num1 = 8
    var num2 = 9
    if (num1 % 2 == 0) {
        println("$num1 is even")
    }

    if (num2 % 2 != 0) {
        println("$num2 is odd")
    }

    // Else-if Expressions
    var rewardsPoints = 17
    var memberType: String

    if (rewardsPoints >= 50) {
        memberType = "Platinum"
    } else if (rewardsPoints >= 25) {
        memberType = "Gold"
    } else if (rewardsPoints >= 10) {
        memberType = "Silver"
    } else {
        memberType = "Bronze"
    }

    println("You are a $memberType type member.")

    // Logical Operators: &&, ||, !

    var a = true
    var b = false
    var c = true
    var d = false

    if (a || b) {
        println("Hoorah!")
    }

    if (!b && c) {
        println("Woohoo!")
    }

    if (a || d) {
        println("Yay!")
    }

    if (!(d && b)) {
        println("Wow!")
    }

    // Nested Conditionals
    planet()

    // When Expressions

    var name = "Juan"
    when (name) {
        "Pedro" -> println("Nope.")
        "Karl" -> println("Nope.")
        "Juan" -> println("Yup.")
        "Dan" -> println("Nope.")
    }

    var season = "Fall"
    when (season) {
        "Winter" -> println("Grow kale.")
        "Spring" -> println("Grow lettuce.")
        "Summer" -> println("Grow corn.")
        "Fall" -> println("Grow pumpkins.")
        else -> println("Not a valid season.")
    }

    // Range
    range()

}

// Nested Conditionals
fun planet() {
    var orbitsStar = true // Rule 1
    var hydrostaticEquilibrium = true // Rule 2
    var clearedOrbit = false // Rule 3

    // Write your code below

    if (orbitsStar && hydrostaticEquilibrium){
        if (clearedOrbit){
            println("Celestial body is a planet.")
        } else {
            println("Celestial body is a dwarf planet.")
        }
    }
}

// Range
fun range() {

    var sHU = 17000
    var pungency: String

    if (sHU in 0..699) {
        pungency = "very mild"
    } else if (sHU in 700..2999) {
        pungency = "mild"
    } else if (sHU in 3000..24999){
        pungency = "moderate"
    } else if (sHU in 25000..69999) {
        pungency = "high"
    } else {
        pungency = "very high"
    }

    println("A pepper with $sHU Scoville Heat Units has a $pungency pungency.")
}


