package co.selena.kotlincourse.lessons.lesson3

abstract class AquariumFish: FishAction {
    abstract val color: String
    override fun eat() = println("yum")
}