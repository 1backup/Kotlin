// Primary constructor with initializer block
class myClass(name: String, id: Int) {
    val e_name: String
    var e_id: Int
    init{
        e_name = name.lowercase()
        e_id = id

        println("Name = ${e_name}")
        println("Id = ${e_id}")
    }
}
fun main(args: Array<String>){
    val myclass = myClass ("Ashu", 101)
}


// secondary constructor
class myClass{
    constructor(name: String, id: Int){
        println("Name = ${name}")
        println("Id = ${id}")
    }
}
fun main(args: Array<String>){
    val myclass = myClass ("Ashu", 101)
}

// Calling one secondary constructor from another secondary constructor of same class
class myClass{

    constructor(name: String, id: Int): this(name,id, "mypassword"){ // executes second
        println("this executes next")
        println("Name = ${name}")
        println("Id = ${id}")
    }

    constructor(name: String, id: Int,pass: String){ // executes first
        println("this executes first")
        println("Name = ${name}")
        println("Id = ${id}")
        println("Password = ${pass}")
    }
}

fun main(args: Array<String>){
    val myclass = myClass ("Ashu", 101)
}  


