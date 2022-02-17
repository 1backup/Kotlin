fun main() // starting
{
    println(" >>> function / method <<< \n") //  its just like switch case in java

    function()
    println(function2(12,13))
}

fun function() : Unit // void type, it doesnt return anythinng
{
    println("here i am")
}

// para meterized
//fun function2( {variable 1}: {its type} , {variable 2} : {its type}) : {return type}

fun function2(a: Int , b : Int) :Int 
{
    var a =a;
    var b = b;

    return (a+b)
}

fun main(args: Array<String>)
{
    // from telusko
    var add : Int = addNum(9,10)
    println(add)

}

fun addNum(num1: Int, num2: Int) : Int = num1+num2 // it will return an int output
