package co.selena.kotlincourse.lessons.lesson3.decor

data class Decoration(val rocks: String) {

}

fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1) // Decoration(rocks=granite)

    val decoration2 = Decoration("slate")
    println(decoration2) //  Decoration(rocks=slate)

    val decoration3 = Decoration("slate")
    println(decoration3) //  Decoration(rocks=slate)

    println (decoration1.equals(decoration2)) // false
    println (decoration3.equals(decoration2)) // true


}