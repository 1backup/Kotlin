fun main(args: Array<String>) {

    val myMap = mapOf(1 to "Ajay", 4 to "Vijay", 3 to "Prakash","ram" to "Ram", "two" to 2)

    // getting keys
    for(key in myMap.keys){
        println("Element at key $key = ${myMap.get(key)}")
    }

    // get specific values
    println(myMap.getValue(4))

    // checking if contains
    println( myMap.contains(3))
    println(myMap.containsKey(2)) // checking keys
    println(myMap.containsValue("Ajay")) // checking vlaues
    
    // gettin rid of any vlaues
    for(m in myMap.minus(4)){
        println(myMap[m.key])
    }
}
