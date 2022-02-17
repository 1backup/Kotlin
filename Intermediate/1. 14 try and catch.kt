fun main(args: Array<String>)
{
    // from telusko

    var  str : String = "4a"
    var num : Int

    try {
        num = str.toInt()
    }

    catch (e : Exception)
    {
        println(e)
    }

    //  using try and catch block as expression

    var num2: Int = try {
        str.toInt()
    }
    catch (e: Exception)
    {
        -1 // assinging value to kotlin
    }

    println(num2)
}
