fun main () {

    val costOfGas = 2.28
    val mileage = 25
    val distance: Int

    println("What's your name?")
    val name = readLine()

    println("What's your friend's' name?")
    val friendsName = readLine()

    println("Enter the first adjective:")
    val adjective = readLine()

    println("Enter any city")
    val city = readLine()

    println("What band are you going to see?")
    val bandName = readLine()

    println("What jobs is $friendsName doing in order to save money?")
    val work = readLine()

    println("Enter an amount of miles between 400 and 600")

    //Setting the distance
    distance = Integer.valueOf(readLine())

    var totalForGas = (costOfGas / mileage) * distance
    totalForGas = Math.round(totalForGas * 100) / 100.00

    val totalMoneySaved = totalForGas + 20

    print("""
  A long time ago, $name and their friend $friendsName planned a(n) $adjective road trip to see their favorite band: $bandName. 
  The venue was $distance miles away which meant they needed to save $$totalForGas dollars to get there.
  Both of them worked as $work for the whole summer and managed to save up a total of $$totalMoneySaved dollars!
  To celebrate, they ended up driving to $city for the whole weekend; seeing their band and buying $bandName t-shirts to remember their trip.
  """.trimIndent())
}