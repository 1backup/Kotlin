fun doAction(view: View){
        CoroutineScope(Dispatchers.IO).launch{
            Log.d("Coroutine", "${Thread.currentThread().name}")
        }
        
        GlobalScope.launch(Dispatchers.Main){
            Log.d("Coroutine", "${Thread.currentThread().name}")
        }

        MainScope().launch(Dispatchers.Default){
            Log.d("Coroutine", "${Thread.currentThread().name}")
        }
    }
