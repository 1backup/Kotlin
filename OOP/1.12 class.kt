fun main(){
    val box1 = box()
    val box2 = box()

    println(box1.height) // dont need to use the get and set
    box1.height = 100
    box1.printHeight() // prints > 100
}

class box(){
    var length : Int = 10
    var width : Int = 20
    var height : Int = 5

    fun fillContents(){
        println("Box is filled")
    }
    fun  open()
    {
        println("Box is opened")
    }
    fun printHeight()
    {
        println(height)
    }

}
