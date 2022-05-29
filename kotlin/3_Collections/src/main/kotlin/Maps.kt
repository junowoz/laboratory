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
    var tvShows = mutableMapOf("The Big Bang Theory" to 278,"Modern Family" to 250, "Bewitched" to 254, "That '70s Show" to 200)
    tvShows["The Big Bang Theory"] = 279
    print(tvShows)
    
    // Adding and Removing Entries | .put and .remove
    var momaPaintings = mutableMapOf("Les Demoiselles d'avignon" to "Pablo Picasso", "The Starry Night" to "Vincent Van Gogh", "Mona Lisa" to "Leonardo Da Vinci", "The Persistance of Memory" to "Salvador Dali")

    if (!momaPaintings.containsValue("Claude Monet")) {
        momaPaintings.put("Water Lillies", "Claude Monet")
 
    }

    momaPaintings.remove("Mona Lisa") // To remove, call the Key (first word)
    println(momaPaintings)
  

}
