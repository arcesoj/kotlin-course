package co.selena.kotlincourse.lessons.lesson3

class Shark: FishColor, FishAction {
    override val color = "grey"

    override fun eat() {
        print("Hunt and eat fish")
    }
}