package co.selena.kotlincourse.lessons.lesson3

class Classes {
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100

    fun printSize(){
        println("Width: ${width} cm + Length: ${length} cm + Height: $height cm")
    }

//    Main Activity
//    fun buildAquarium() {
//        val myAquarium = Aquarium()
//        myAquarium.printSize()
//        myAquarium.height = 60
//        myAquarium.printSize()
//    }
//    Width: 20 cm Length: 100 cm Height: 40 cm
//    Width: 20 cm Length: 100 cm Height: 60 cm
}