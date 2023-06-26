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
        var fbFollwer = 0
        val job  = CoroutineScope(Dispatchers.IO).async {
            getFollower()
            "hello"
        }
        Log.d(tag, job.await())
    }

    private suspend fun getFollower():Int{
        delay(1000)
        return 54
    }
}
