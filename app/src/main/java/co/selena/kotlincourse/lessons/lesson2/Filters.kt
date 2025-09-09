package co.selena.kotlincourse.lessons.lesson2

class Filters {

    fun listFilter() {
        val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

        val eager = decorations.filter { it[0] == 'p' }
        println("eager: $eager") // eager: [pagoda, plastic plant]

        val filtered = decorations.asSequence().filter { it[0] == 'p' }
        println("filtered: $filtered") // filtered: kotlin.sequences.FilteringSequence@386cc1c4

        val newList = filtered.toList()
        println(newList)

        // Flatten
        val myAnimals = listOf("Hen", "Cows", "Ducks", "Horse", "Pigs")
        val myTools = listOf("Tool 1","Tool 2","Tool 3","Tool 4")
        val myFarms = listOf("Farm 1", "Farm 2", "Farm 3", "Farm 4")
        val myBelongings = listOf(myAnimals, myTools,myFarms)
        println("----")
        println("My Belongings: ${myBelongings}") //  [[Hen, Cows, Ducks, Horse, Pigs], [Tool 1, Tool 2, Tool 3, Tool 4], [Farm 1, Farm 2, Farm 3, Farm 4]]
        println("Flat: ${myBelongings.flatten()}") // [Hen, Cows, Ducks, Horse, Pigs, Tool 1, Tool 2, Tool 3, Tool 4, Farm 1, Farm 2, Farm 3, Farm 4]
    }
}