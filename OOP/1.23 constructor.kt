fun main(args: Array<String>)
{

   var num =BigInteger("70000")

    println(fact(num))

}

tailrec  fun fact(num: BigInteger) : BigInteger
{
    if(num == BigInteger.ZERO)
        return BigInteger.ONE
    else
        return num * fact(num- BigInteger.ONE)
}
