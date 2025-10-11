package co.selena.kotlincourse.lessons.lesson3.decor

data class Decoration2(val rocks: String, val wood: String, val diver: String) {

}

fun makeDecorations2() {
    val d5 = Decoration2("crystal", "wood", "diver")

    // Assign all properties to variables.
    val (rock, wood , diver) = d5
    println(rock) // crystal
    println(wood) // wood
    println(diver) // diver

    // In case I don't need some of the properties I can use _
    // val (rock, _ , diver) = d5
}
