fun main(args: Array<String>) : Unit
{
    println(" >>> for <<< \n") 

    for(num in 1..10)
    {
        //println(num)
    }

    // another way
    for(i in 1 until 10)
    {
        print("${i} ") // print 1 to 9. But not 10./ OutPut : 1 2 3 4 5 6 7 8 9
    }
    
    // another way
    println()
    for(i in 10 downTo 1)
    {
        print("${i} ") // output : 10 9 8 7 6 5 4 3 2 1
    }

    //step
    println()
    for(num in 1..10 step 2)
    {
        print("${num} ") // output : 1 3 5 7 9
    }
    println()
    for(i in 10 downTo 1 step 2)
    {
        print("${i} ") // output : 10 8 6 4 2
    }

    // until
    println()
    for (i in 1 until 10) {
        print("${i} ") //output: 1 2 3 4 5 6 7 8 9
    }
}


fun main(args: Array<String>)
{
    // from telusko

    var nums = 1..8 //  range

    for (a in nums step 2 )
    {
        print("${a} ") //1 3 5 7
    }

    println()
    for (a in nums )
    {
        print("${a} ") //1 2 3 4 5 6 7 8
    }

    var  num = 5 downTo 1
    println()
    for (a in num )
    {
        print("${a} ") //5 4 3 2 1
    }

    println()
    var n = 1 until 9 // it will print untill 8
    for( a in n)
    {
        print("${a} ") // 1 2 3 4 5 6 7 8
    }

    println()
    println(n.count())  // it will print length

    var local = 'A'..'E' // always put single quotation

    for (a in local)
    {
        println(a)  // prints from A toE
    }
    
    
    fun main(args: Array<String>) {
    
    for (i in 10 - 1 downTo 0)
    {
        print("${i} ") //  9 8 7 6 5 4 3 2 1 0 
    }
}
    
    


}
