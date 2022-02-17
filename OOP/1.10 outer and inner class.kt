fun main(args: Array<String>) {
    
    val outerClass1 = outerClass() // you cant access Nested in this manner
    val outerClass2 = outerClass.Nested()// to access
    outerClass2.printMessage("Can print this")

    val inner1 = inner()
    inner1.inside().printmessage() // in this manner you can access inner class and execute
}
/*
* this is a nest class example. here you cant use the method of outer class inside the nested clas
* */
class  outerClass(){
    val apple = "apple"
    val number = 24
    class  Nested{
        fun printMessage(message: String){ println() }
    }
}

class inner{
    val apple = "apple"
    val number = 24
    inner class inside{
        fun printmessage(){
            println("$apple's price is $number") // you can access them inside
        }
    }
}
