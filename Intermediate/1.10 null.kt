fun main(args: Array<String>) {

    var name: String?  = null
    //name = "Shoikot"
    println(name?.length) // null safe

    var samplevar : Int? = null
    samplevar = 1
    if(samplevar ==  null)
    {
        println("It is null")
    }
    else{
        println("Not null")
    }

    // elvis operator : If a particular variable is not null =, then use. But if not use other option

    var stringLen: Any = name?.length ?: "If thats not null, this string will be executed"
    println(stringLen) //> If thats not null, this string will be executed

   
}
