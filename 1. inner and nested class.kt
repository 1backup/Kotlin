
/*
* Nested class
* Nested class : is such class which is created inside another class.
* In Kotlin, nested class is by default static,
* so its data member and member function can be accessed without creating an object of class.
* Nested class cannot be able to access the data member of outer class
* */

/*
*Inner class is a class which is created inside another class with
* keyword inner.
* In other words, we can say that a nested class which is marked as "inner" is called inner class.
* Inner class cannot be declared inside interfaces or non-inner nested classes.
* */

/*
* The advantage of inner class over nested class is that,
* it is able to access members of outer class even it is private.
* Inner class keeps a reference to an object of outer class.
* */

fun main (args : Array<String>){
    val outer = Outer.Nested_Class()
    outer.printMessage("hello there")

    val outer2 = Outer2().Inner_Class()
    outer2.printMessage("Even")

}

//nested
class Outer{
    val apple = "apple"
    val number = 25

     class Nested_Class{
      fun printMessage(message : String){
          println(message)
      }
    }

}

// inner
class Outer2{
    val apple = "apple"
    val number = 25
    inner class Inner_Class{
        fun printMessage(message : String){
            println("${apple} price is ${number} ${message}") // see you can access the outer class value
        }
    }
}
