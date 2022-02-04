// unit is the return type. Unit stands for void in kotlin which means nothing in return
fun main(args: Array<String>) : Unit
{
    println(" >>> when <<< \n") //  its just like switch case in java

    var season = 3
    when (season)
    {
        1 -> println("you are in 1 case")
        2 -> println("You are in  number 2 case")
        3 ->{
            println("you are in multiline case")
        }
        else -> println("this one is like default case")
    }

    var month =3
    when(month) //for range of values
    {
        in 3..5 -> println("Spring") // between 3 to 5
        !in 6..8 -> println("Summer") // not in
        in 9..11 -> println("Fall")
        12,1,2 -> println("Winter") // particular 12,1 ,2
        else -> println("Invalid season")
    }

    var x : Any = 13.37

    when(x)
    {
        !is Int -> println("Integer")
        is Double -> println("Double")
        is String -> println("String")
        else -> println("None of this is ${x}")
    }
}


fun main(args: Array<String>)
{
    // from telusko

    var num: Int = 2

    var str = when(num)
    {
        1 -> "one"
        2 -> "two"
        3 -> "three"
        4 -> "four"
        5 -> "five"
        6 -> "six"
        else -> " Give proper number"
    }

    println("num is ${str}")
