
fun main(args: Array<String>)
{
    var nums = intArrayOf(10,11,12,13,14)

    println(nums[1])

    // to set the the value you can use this below method
    nums[1] = 2122
    // or
    nums.set(2,383)

    for (i in nums)
        println(i)

    // tp get the last value, you can either use the method

    println("Last number : "+nums.last())

    // when you dont know any element of the array, but want to declare an array of some size, use this
    var num = IntArray(4)
    // for double
    var d = DoubleArray(5)
    // for  string
    var s =  arrayOfNulls<String>(4) // 4 is thee size and <String > is the type

    /*
    var myArray1 = arrayOf(1,10,4,6,15)
    var myArray2 = arrayOf<Int>(1,10,4,6,15)
    val myArray3 = arrayOf<String>("Ajay","Prakesh","Michel","John","Sumit")
    var myArray4= arrayOf(1,10,4, "Ajay","Prakesh")
    val array2 = arrayOf<Long>(11,12,13,14)
    */
}

/*
11
10
2122
383
13
14
Last number : 14
* */


// --------------------------------------------------------------------------------------------------------
// setting values
fun main(args: Array<String>){
    var myArray = Array<Int>(5){0}  // we are simply initialize an array of size 5 with default value as 0
    for(element in myArray){
        println(element)
    }
}
