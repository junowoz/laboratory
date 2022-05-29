fun lists () {
    // Immutable Lists
    var waterSports = listOf("Wind Surfing", "Sailing","Swimming", "Jet Skiing", "Water Skiing")
    println(waterSports)

    // Accessing Elements
    var unitedStatesMarathons = listOf("Boston Marathon","Bank of America Chicago Marathon","TCS NYC Marathon","Marine Corps Marathon")
    println(unitedStatesMarathons[1])

    // Mutable Lists
    var openBroadwayShows = mutableListOf("The Lion King","Chicago","The Cher Show","Les Miserables")
    openBroadwayShows[2] = "Wicked"
    println(openBroadwayShows)

    // Size Property
    var fruitTrees = mutableListOf("Apple","Plum", "Pear", "Cherry")
    println("I am growing ${fruitTrees.size} different types of fruit in my garden.")

    // List Functions
    val planets = mutableListOf("Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")
    planets.remove("Pluto")
    planets.add("Earth")

    println(planets)
    println(planets.random())

}
