fun main() {

    // For Loops
    for (i in 1..5){
        println("Hello, Codey!")
        println("i = $i")
    }

    // Controlig the Iteration
    println("-- 1st for loop output --")
    for (i in 10 downTo 1){
        println("i = $i")
    }

    println("-- 2nd for loop output --")
    for (j in 1 until 10){
        println("j = $j")
    }

    println("-- 3rd for loop output --")
    for (k in 1..10 step 2){
        println("k = $k")
    }

    // Iterating Through Collections: indices and with.Index
    val mySchedule = listOf("Eat Breakfast", "Clean Up", "Work", "Eat Lunch",  "Clean Up", "Work", "Eat Dinner", "Clean Up")
    val myTasks = setOf("Eat Breakfast", "Clean Up", "Work", "Eat Lunch",  "Clean Up", "Work", "Eat Dinner", "Clean Up")

    println("\n-- mySchedule Output --")
    for(task in mySchedule){
        println(task)
    }

    println("\n-- mySchedule Indices Output --")
    for(task in mySchedule.indices){
        println(task)
    }

    println("\n-- myTasks withIndex Output --")
    for ((taskIndex, task) in myTasks.withIndex()){
        println("$taskIndex: $task")
    }

    // Iterating Through Maps
    val favoriteColors = mapOf("Jesse" to "Violet", "Megan" to "Red", "Tamala" to "Blue", "Jordan" to "Pink")

    println("\n-- Key: Value Output --")
    for((favoriteEntry, colors) in favoriteColors){
        println("$favoriteEntry: $colors")
    }
    for(favoriteEntry in favoriteColors) { // Analog way
        println("${favoriteEntry.key}: ${favoriteEntry.value}")
    }

    println("-- Only Values Output --")
    for (color in favoriteColors.values){
        println(color)
    }

    // While Loop
    var counter = 0
    var index = 0
    val schoolGrades = listOf("Kindergarten", "1st", "2nd", "3rd", "4th", "5th", "6th", "7th")

    println("-- counter Output --")
    while(counter < 5){
        println(counter)
        counter += 1
    }

    println("\n-- Elementary School Grades --")
    while(schoolGrades[index] != "6th"){
        println(schoolGrades[index])
        index += 1
    }

    // do.. While
    var inddex = 0
    val celsiusTemps = listOf(0.0, 87.0, 16.0, 33.0, 100.0, 65.0)
    val fahr_ratio = 1.8
    var fahr: Double

    println("-- Celsius to Fahrenheit --")
    do{
        fahr = celsiusTemps[inddex] * fahr_ratio + 32.0
        println("${celsiusTemps[inddex]}C = ${fahr}F")
        inddex += 1
    }while (fahr != 212.0)

    // Nested Loops

    for (i in 1..6){
        for (j in 'A'..'F'){
            print("$j$i ")
        }
        println(" ")

        /* This creates:
        A1 B1 C1 D1 E1 F1
        A2 B2 C2 D2 E2 F2
        A3 B3 C3 D3 E3 F3
        A4 B4 C4 D4 E4 F4
        A5 B5 C5 D5 E5 F5
        A6 B6 C6 D6 E6 F6
         */

    }

    // Jump Expressions: Break and Continue

    val rooms = listOf("Kitchen", "Living Room", "Basement", "Bathroom")

    println("-- Room Search --")
    for (room in rooms) {
        print("$room: ")
        // Write your code below
        if (room == "Living Room") {
            println("Found It!")
            break
        }
        println("Found Nothing.")
    }

    println("\n-- Divide By Zero --")
    for (number in 12 downTo -12 step 4) {
        // Write your code below
        if (number == 0){
            continue
        }

        println("120/number = ${120/number}")
    }

    // Labeled Jump Expressions

    grid@ for (i in 1..6) {
        for (j in 'A'..'F') {
            if (j == 'C'){
                continue@grid
            }

            print("$j$i ")

        }
        println()
    }
}
