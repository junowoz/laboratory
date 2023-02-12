fun main() {

    var responsibilities = listOf("feed the chimps","play a random game","conduct a health check on Foxie")

    var responsibilitiesComplete = 0
    var timeSpent = 0
    var totalShiftTime = 4

    var foxiesHealthCheck = mutableMapOf<String, Any?>()
    var chimpsHaveEaten = mutableMapOf("Bonnie" to false,"Jubilee" to false,"Frodo" to false,"Foxie" to false)

    // Feeding the Chimps
    println("First, ${responsibilities[0]}")
    println("Feeding Bonnie....")
    chimpsHaveEaten["Bonnie"] = true

    timeSpent++
    responsibilitiesComplete++

    println("All chimps have now been fed! You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

    // Playing a Random Game
    println("Next, ${responsibilities[1]}.")

    var games = setOf("tug-of-war with a blanket","catch and throw","number game")
    var randomGame = games.random()
    println(randomGame)

    timeSpent++
    responsibilitiesComplete++

    println("Each chimp has now played a game of $randomGame! You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

    // Conducting a Health Check
    println("Next, ${responsibilities[2]}.")

    foxiesHealthCheck.put("temperature", 32.7)
    foxiesHealthCheck.put("mood", "happy")

    println("Foxie has a temperature of ${foxiesHealthCheck["temperature"]} and is feeling ${foxiesHealthCheck["mood"]}.")

    timeSpent++
    responsibilitiesComplete++

    println("You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

    // Some logic
    if (timeSpent <= totalShiftTime && responsibilitiesComplete == responsibilities.size) {
            println("Congratulations!")
    } else if (timeSpent >= totalShiftTime && responsibilitiesComplete == responsibilities.size ){
            println("Congratulations, but with overtime!")
    } else {
            println("Nope, do it all again!")
    }
}