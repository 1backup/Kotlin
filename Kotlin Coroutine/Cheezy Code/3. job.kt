
class MainActivity : AppCompatActivity() {
    private  val tag: String  = "hola"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CoroutineScope(Dispatchers.IO).launch {
            printFollwers()
        }

    }

    private suspend fun printFollwers() {
        /*
        var fbFollwer = 0
        CoroutineScope(Dispatchers.IO).launch {
            fbFollwer = getFollower()
        }
        Log.d(tag, fbFollwer.toString())

        this above code is withut using the job and the OUTPUT is 0.
        but if we want to execute the Coroutine first and then print the value of follower, in that case we have to use the job function.
        */


        var fbFollwer = 0
        val job  = CoroutineScope(Dispatchers.IO).launch {
            fbFollwer = getFollower()
        }
        job.join()// this will wait for the job to finish, and only then it will go and execute the function. must use SUSPEND when using job.
        Log.d(tag, fbFollwer.toString()) // output : 54

    }

    private suspend fun getFollower():Int{
        delay(1000)
        return 54
    }
}

