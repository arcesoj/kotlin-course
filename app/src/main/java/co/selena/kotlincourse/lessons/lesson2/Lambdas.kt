package co.selena.kotlincourse.lessons.lesson2

class Lambdas {

    fun lambdas (){
        var dirtyLevel = 20
        val waterFilter = { dirty : Int -> dirty / 2 }
        println(waterFilter(dirtyLevel)) // 10
    }

    fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
        return operation(dirty)
    }

    fun highOrderFunction(){
        val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
        println(updateDirty(30, waterFilter)) // 15
    }
}