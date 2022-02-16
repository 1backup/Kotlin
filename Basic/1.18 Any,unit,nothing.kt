fun main (args: Array<String>): Unit{

    // Any : Every type in kotlin except null
    val num : Any = 45
    val num2 : Any = "A"
    println(num :: class) // > class kotlin.Int
    println(num2 :: class) // > class kotlin.String

    // Unit: Anything that doesnt return any thing, is unit type
    add() // > 5


    /*
    * nothing : Fun is never completes.
    * this function will always run without returning anything
    * retunr nothing, do nothing
    * */
}

fun doNothing(): Nothing{
    while (true){
    }
}

fun  add(): Unit{ // presents as a void in java
    val result =2 + 3
    println(result)
}
