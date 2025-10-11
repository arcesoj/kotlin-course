package co.selena.kotlincourse.lessons.lesson3

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}