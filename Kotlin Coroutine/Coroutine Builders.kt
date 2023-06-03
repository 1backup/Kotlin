// RUN, BUILD, RUN BLOCKING
//  if the life time of any screen is over, then its coresponding coroutine is also over. 
// that is why the global coroutine is used, becasue it doesn't gets destroyed, 
'''
global scope : example 
1. file download
2. play music 
*its discouraged to use , because it can consume a lot of memory.*


normal launch 
1.some data computation
2. login opeartion. 
 * launch use the coroutine that block the current thread, 
 *  It inherits the thread and coroutine scope of the immediate parent coroutine .
 
why launch coroutine builder called fire and forget: 
 In the case of coroutine builders, such as in languages like Kotlin, 
 "fire and forget" refers to launching a coroutine without explicitly waiting for
 its completion or capturing its result.
 
 
 join function also serves the purpose of the delay function. 
'''




// code 1 :  using only the launce function
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    runBlocking { // this is inside the main thread.
        println("Main Program Starts ${Thread.currentThread().name}") //this is for main thread

        launch { // child coroutine in this case.
            println("Fake work starts: ${Thread.currentThread().name}")
            delay(1000)
            println("Fake work stops: ${Thread.currentThread().name}")
        }

        delay(2000) 
        println("Main Thread finish ${Thread.currentThread().name}") //this is for main thread
    }

}

// output : 
Main Program Starts main
Fake work starts: main
Fake work stops: main
Main Thread finish main





// code 2 :  using job 
import kotlinx.coroutines.*

fun main(){

    runBlocking { // this is inside the main thread.
        println("Main Program Starts ${Thread.currentThread().name}") //this is for main thread

        val job: Job = launch {
            println("Fake work starts: ${Thread.currentThread().name}")
            delay(1000)
            println("Fake work stops: ${Thread.currentThread().name}")
        }


        job.join() // this job function also wait for the coroutine to complete execution 
        println("Main Thread finish ${Thread.currentThread().name}") //this is for main thread
    }

}

// output 
Main Program Starts main
Fake work starts: main
Fake work stops: main
Main Thread finish main






// code 3 : using async function . 


