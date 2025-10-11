package co.selena.kotlincourse.lessons.lesson3.decor

enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}

fun callDirection(){
    println(Direction.EAST.name) // EAST
    println(Direction.EAST.ordinal) // 2
    println(Direction.EAST.degrees) // 90
}