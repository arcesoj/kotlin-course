package co.selena.kotlincourse.lessons.lesson2

import java.util.Random

class Functions {

    private fun randomDay(): String {
        val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" )
        return week[Random().nextInt(week.size)]
    }

    fun fishFood (day : String) : String {
        return when (day) {
            "Monday" -> "flakes"
            "Tuesday" -> "pellets"
            "Wednesday" -> "redworms"
            "Thursday" -> "granules"
            "Friday" -> "mosquitoes"
            "Saturday" -> "lettuce"
            "Sunday" -> "plankton"
            else -> "nothing"
        }

//        var food : String
//        when (day) {
//            "Monday" -> food = "flakes"
//            "Tuesday" -> food = "pellets"
//            "Wednesday" -> food = "redworms"
//            "Thursday" -> food = "granules"
//            "Friday" -> food = "mosquitoes"
//            "Saturday" -> food = "lettuce"
//            "Sunday" -> food = "plankton"
//            else -> food = "nothing"
//        }
//        return food
    }

    private fun feedTheFish() {
        val day = randomDay()
        val food = fishFood(day)
        println("Today is $day and the fish eat $food")
        println("Change water: ${shouldChangeWater(day)}")
    }

    // Default parameter value
    // Default parameter value could be also a fun for instance swim(speed: getSpeedReading())
    fun swim(speed: String = "fast") {
        println("swimming $speed")
    }

    // Required parameter
    fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 22): Boolean {
        return when {
            temperature > 30 -> true
            dirty > 30 -> true
            day == "Sunday" -> true
            else -> false
        }
    }

    // Compact Functions
    fun isTooHot(temperature: Int) = temperature > 30
    fun isDirty(dirty: Int) = dirty > 30
    fun isSunday(day: String) = day == "Sunday"

    fun shouldChangeWaterTwo(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
        return when {
            isTooHot(temperature) -> true
            isDirty(dirty) -> true
            isSunday(day) -> true
            else -> false
        }
    }
    // End compact Functions

    fun main(args: Array<String>) {
        println("Hello, World!")

        val temperature = 10
        val isHot = if (temperature > 50) true else false
        println(isHot)

        val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
        println(message)

        feedTheFish()

        /* Default  value for a parameter */
        swim()   // uses default speed
        swim("slow")   // positional argument
        swim(speed="turtle-like")   // named parameter
    }
}