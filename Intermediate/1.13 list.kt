fun main(args: Array<String>) {

    var list = listOf("Ajay","Vijay","Prakash")//read only, fix-size
    var list1 = listOf(1,2,3,"Ajay","Vijay","Prakash")

    // declaring type of list
    var intList : List<Int> = listOf(1,2,3,4)
    var stringList : List<String> = listOf("one", "two", "three")



    // way of printing
    for(element in list){
        println(element)
    }

    // another way of printing
    for(index in 0..list.size-1){
        println(list[index])
    }

    // diffrent function
    println(stringList.get(0))
    println(stringList.indexOf("Vijay"))
    println(stringList.lastIndexOf("Vijay"))
    println(stringList.size)
    println(stringList.contains("Prakash"))
    println(stringList.containsAll(list)) // checking if all item of one list exist in another
    println(stringList.subList(2,4))
    println(stringList.isEmpty())
    println(stringList.drop(1)) // drops the 1st value
    println(stringList.dropLast(2)) // drops the last 2 value

}
