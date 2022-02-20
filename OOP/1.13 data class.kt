data class student(val id: Int, val name: String, val versit_name: String){ // you cant extend data class

    fun getInfo() {
        println("id :$id  \nname: $name\nversity: $versit_name")
    }
}
fun main(){
    val person = student(109291, "Maruf", "BRACU")
    val person2 = student(10929, "Marf", "BRAC")

    println(person.name)
    println(person2.versit_name)

    person2.getInfo()// prints all the info
}
