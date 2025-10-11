package co.selena.kotlincourse.lessons.lesson3

// Step 1: Create a constructor
open class Aquarium(open var length: Int = 100,open var width: Int = 20, open var height: Int = 40) {

    // Step 2: Init block
    init {
        println("aquarium initializing")
    }
    init {
        // 1 liter = 1000 cm^3
        // println("Volume: ${width * length * height/ 1000} liters")
    }
    open val shape = "rectangle"
    open var water: Double = 0.0
        get() = volume * 0.9

    // Step 3: Secondary constructor
    constructor(numberOfFish: Int): this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

    // Step 4: new property getter
    open var volume: Int
        get() = width * height * length / 1000 // 1000 cm^3 = 1 liter
        // Step 5: property setter
        set(value) {
            height = (value * 1000) / (width * length)
        }
    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm "
        )

        println("Volume: ${volume} liters")
    }

    // MainActivity
    fun buildAquarium() {
        val aquarium6 = Aquarium(numberOfFish = 29)
        aquarium6.printSize()
        aquarium6.volume = 70
        aquarium6.printSize()
    }

    /*
        aquarium initialized
        Width: 20 cm Length: 100 cm Height: 31 cm
        Volume: 62 liters
        Width: 20 cm Length: 100 cm Height: 35 cm
        Volume: 70 liters
     */
}