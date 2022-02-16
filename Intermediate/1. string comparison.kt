fun main(args: Array<String>)
{
    // from telusko

    var alien1: String = "Youtube"
    var alien2: String = "youtube"

    // one way
    if (alien1 == alien2)
        println("same")
    else
        println("not Same")

    // to ignore case
    if(alien1.equals(alien1, ignoreCase = true))
        println("they are same")
    else
        println("they are not the same")
}
