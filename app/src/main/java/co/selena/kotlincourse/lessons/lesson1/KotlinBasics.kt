package co.selena.kotlincourse.lessons.lesson1

class KotlinBasics {
    fun ConditionsAndBooleans() {
        // Step: #1 >, <, <=, >=, ==, != operators
        val numberOfFish = 50
        val numberOfPlants = 23
        if(numberOfFish > numberOfPlants) {
            println("Good ratio!")
        } else {
            print("Unhealthy ratio")
        }

        // Step: #2 .. operator
        val fish = 50
        if(fish in 1..100) {
            print(fish)
        }

        // Step: #3 advanced conditions &&, ||,
        if (numberOfFish == 0 || numberOfFish < 0) {
            println("Empty tank")
        } else if (numberOfFish < 40) {
            println("Got fish!")
        } else {
            println("That's a lot of fish!")
        }

        // Step: #4 When statement
        when (numberOfFish) {
            0  -> println("Empty tank")
            in 1..39 -> println("Got fish!")
            else -> println("That's a lot of fish!")
        }
    }

    fun nullability() {
        // var rocks: Int = null <= Type error
        var marbels: Int? = null // allow null values

        // Step #2 ? and ?: operator
        // Easy declaration
        var fishFoodTreats: Int? = 6
        if (fishFoodTreats != null) {
            fishFoodTreats = fishFoodTreats.dec()
        }

        // Using ? operator
        fishFoodTreats = null
        fishFoodTreats = fishFoodTreats?.dec()

        // Chain null test with ?: operator
        fishFoodTreats = fishFoodTreats?.dec() ?: 0

        // Note:
        var s: Int? = null;
        // val len = s!!.length   // throws NullPointerException if s is null
    }

    fun arrayListAndLoops() {
        // Step #1 list
        val school = listOf("anglo", "marymount", "julio mario")
        println(school)

        // mutable list
        val myList = mutableListOf("anglo", "marymount", "julio mario")
        myList.remove("anglo")

        // Step #2 arrays

        val schoolArray = arrayOf("anglo", "marymount", "julio mario")
        println(java.util.Arrays.toString(schoolArray))

        // Step #3 loops
        for (element in schoolArray) {
            print(element + " ")
        }

        for ((index, element) in schoolArray.withIndex()) {
            println("Item at $index is $element\n")
        }
    }
}

