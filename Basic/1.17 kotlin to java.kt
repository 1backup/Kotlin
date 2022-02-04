// 1st create  java class
public class alien {

    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// > above is the java code and below is the kotlin code

// from below kotlin code you can create a object  of the java class then easily access it. 

fun main(args: Array<String>)
{
    var telusko = alien()

    // you don't have to use any set or get method to get the value.
    telusko.name = "navin"  // here you are setting the value

    println(telusko.name) // here you are getting the value. 
    
}
