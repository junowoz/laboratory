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
    // Write your code below

    println("\n-- Only Values Output --")
    // Write your code below

}