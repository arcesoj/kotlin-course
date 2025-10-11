package co.selena.kotlincourse.lessons.lesson3

import android.health.connect.datatypes.units.Length

class House(rooms: Int = 1, bathrooms: Int = 1, floors: Int = 1, length: Int = 10, width: Int = 3) {
    var rooms: Int = rooms
    var bathrooms: Int = bathrooms
    var floors: Int = floors

    init {
        println("house initializing")
    }
    init {
        //
        print("area: ${length * width} mts")
    }

    fun printHouse(){
        println("Rooms: ${rooms}, Bathrooms: ${bathrooms}, Floors: ${floors}")
    }

//    MainActivity
//    fun buildHourse(){
//        val house1 = House()
//        house1.printHouse() // default values
//
//        val house2 = House(bathrooms = 2, floors = 2)
//        house2.printHouse() // default rooms value
//
//        val house3 = House(rooms = 5, bathrooms = 3, floors = 1)
//        house3.printHouse() // everything custom
//    }

}