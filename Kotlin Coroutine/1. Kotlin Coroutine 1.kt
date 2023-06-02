import kotlin.concurrent.thread
fun main(){

    println("Main Program Starts ${Thread.currentThread().name}") //this is for main thread

    thread { // this is a background thread which cant block the code of the main thread.
        println("Fake work starts: ${Thread.currentThread().name}")
        Thread.sleep(1000)
        println("Fake work stops: ${Thread.currentThread().name}")
    }
    
    println("Main Thread finish ${Thread.currentThread().name}") //this is for main thread
    
    // after completing the main thread, the back ground thread will work. 
    // which means that this 2 main thread will execute first and only then it will execute the background thread. 
}

// output of the above code : 
Main Program Starts main
Main Thread finish main
Fake work starts: Thread-0
Fake work stops: Thread-0





// code 2: 
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
fun main(){

    println("Main Program Starts ${Thread.currentThread().name}") //this is for main thread

    GlobalScope.launch { 
        println("Fake work starts: ${Thread.currentThread().name}")
        Thread.sleep(1000)
        println("Fake work stops: ${Thread.currentThread().name}")
    }
    println("Main Thread finish ${Thread.currentThread().name}") //this is for main thread

}
// output : 
Main Program Starts main
Main Thread finish main
// so above code 2 is for coroutine, where the code doesn't execute the background code. 
// so hence in this case for coroutine is different from thread. 





// code : 3
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main(){
    println("Main Program Starts ${Thread.currentThread().name}") //this is for main thread
    
    GlobalScope.launch { // this is a background thread which cant block the code of the main thread.
        println("Fake work starts: ${Thread.currentThread().name}")
        Thread.sleep(1000)
        println("Fake work stops: ${Thread.currentThread().name}")
    }
    
    Thread.sleep(2000)
    println("Main Thread finish ${Thread.currentThread().name}") //this is for main thread
}

// out put 
Main Program Starts main
Fake work starts: DefaultDispatcher-worker-1
Fake work stops: DefaultDispatcher-worker-1
Main Thread finish main

// in this case the code run the backgroun thread when we give time. 
// becasue in the real world we don't know how much time it will take 
// so we need find better soultion. 


// another important thing 

//use 
delay(1000) 
// in place of 
Thread.sleep(1000)

// because in case of thread.sleep, the whole code of the subsequent thread gets blocked, 
// where as in case of delay the whole code of subsequent thread gets suspended, instead of getting blocked, it allows other thread to work, 
// where in case of thread. sleep() it wont work. 
