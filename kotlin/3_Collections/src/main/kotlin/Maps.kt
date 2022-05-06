fun maps() {
    
    // Creating an Immutable Map
    
    var codeysMap = mapOf("valley" to "scorpions", "creek" to "snakes", "forest" to "bears")
    println(codeysMap)
    
    // Retrieving Keys and Values
     var uniqueTransport = mapOf("India" to "Tuktuk", "Egypt" to "Felucca", "Peru" to "Totora Boat", "Hong Kong" to "Junk Boat")
     println("A unique mode of transportation that exists in Peru is ${uniqueTransport["Peru"]}.")
     println(uniqueTransport.keys)
     println(uniqueTransport.values)
    
    // Creating a Mutable Map
}
