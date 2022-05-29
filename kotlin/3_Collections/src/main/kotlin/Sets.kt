fun sets () {

    // Immutable Set: setOf
    var obsoleteTech = setOf("Rolodex","Phonograph","Videocassette recorder","Video projector","Rolodex")
    println(obsoleteTech)

    // Accessing Elements in a Set: elementAt | elementAtOrNull

    var islandsOfHawaii = setOf("Maui","Lanai","Oahu","Kauai")
    print(islandsOfHawaii.elementAt(2))
    print(islandsOfHawaii.elementAtOrNull(6))

    // Creating a Mutable Set: mutableSetOf

    var apolloLandingSites = mutableSetOf("Mare Tranquillitatis","Fra Mauro","Hadley/Apennines","Descartes","Taurus-Littrow","Oceanus Procellarum")
    println(apolloLandingSites)

    // Adding and Removing Elements
    var noneSet = mutableSetOf(1,2,6,3)
    noneSet.add(43)
    noneSet.addAll(noneSet)
    println(noneSet)

    var uniqueParticipants = mutableSetOf<String>()
    var participants = listOf("elePHPant", "Gopher", "Lenny", "Moby Dock", "Codey", "Gopher")

    uniqueParticipants.addAll(participants)
    uniqueParticipants.size
    println("The talent show has ${uniqueParticipants.size} unique participants.")
    uniqueParticipants.clear()
    println(uniqueParticipants)

    // Additional Set Functions

    var testGrades = mutableSetOf(65,50,72,80,53,84)
    var sum = testGrades.sum()
    var numStudents = testGrades.size
    var average = sum/numStudents

    if (average < 65){
        println("Failed")
    } else {
        println("Passed")
    }

}