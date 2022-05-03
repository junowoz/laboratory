import javax.swing.event.RowSorterEvent.Type

// Introduction, Data Types and Variables in Kotlin
fun main(){
    println("Hello World!")

    // Variables
    var todaysDate = "04/29/2022"
    println(todaysDate)

    var currentWeather: String
    currentWeather = "Sun"
    println(currentWeather)

    // Constant
    val pi: Double = 3.14

    // Strings

    val landmark = "Statue of Liberty 🗽"
    val city = "New York"
    val country = "USA"

    // Characters

    var letter = 'A'
    var digit = '1'
    var symbol = '*'

    // Fun fact

    /* A single emoji is made up of Unicode characters.
    Thus, it will be interpreted as a String
    and must always be wrapped in double quotes:  */

    var emoji = "🤓"

    // String Templates
    val dog = "Toto"
    val state = "Kansas"
    val movie = "The Wizard of Oz"

    println("$dog, I've a feeling we're not in $state anymore. - $movie, 1939")

    // User Input
    println("Please type your name and hit Enter.")

    var myName = readLine()
    println("Your name is $myName!")

    // Built-in Properties and Functions

    val tallestMountain = "Mount Everest"
    println(tallestMountain.length) // Prints: 13

    var name = "codecademy"
    println(name.capitalize()) // Prints: Codecademy


    var word = "supercalifragilisticexpialidocious"
    word = word.capitalize()

    var wordSize = word.length
    println("$word has $wordSize letters.")

    // Character Escape Sequences
    print("Dear Learner,\n\nI hope you're enjoying the Learn Kotlin course. " +
            "You've made tremendous progress. Keep going! " +
            "And remember, \"Knowledge is power\". (Frances Beacon)." +
            "\n\nWith love, \nCodey")

    // Numbers
    println("The product of 6 and 2, is ${6 * 2}")  // Prints: The product of 6 and 2 is 12

    //Augmented Assignment operators
    var speedOfLight = 186000
    speedOfLight += 282

    println("The speed of light is ${speedOfLight}.")

    // Increment and decrement operators
    var apples = 5

    apples++
    println(apples) // Prints: 6

    apples--
    println(apples) // Prints: 5

    // Math Library

    var ceil = Math.ceil(3.5)
    println(ceil)

    var sqrt = Math.sqrt(25.0)
    println(sqrt)

    var abs = Math.abs(-20)
    println(abs)

    var floor = Math.floor(6.9)
    println(floor)

    var random = Math.random()
    println(random)

    var round = Math.round(3.16)
    println(round)

    var min = Math.min(5, 3)
    println(min)

    var max = Math.max(8, 10)
    println(max)

    var pow = Math.pow(5.0, 3.0)
    println(pow)
}