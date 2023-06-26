package com.example.kotlin_coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CoroutineScope(Dispatchers.Main).launch{
            task1()
        }
        CoroutineScope(Dispatchers.Main).launch{
            task2()
        }
    }


    suspend fun task1(){
        Log.d("hola","Starting task 1")
        yield() // this is a suspension point, where other coroutine or task can be executed
        Log.d("hola","Ending task 1")
    }



    suspend fun task2(){
        Log.d("hola","Starting task 2")
        yield()
        Log.d("hola","Ending Task 2")
    }
}

/* Output
2023-06-27 01:34:39.355 17532-17532/com.example.kotlin_coroutines D/hola: Starting task 1
2023-06-27 01:34:39.356 17532-17532/com.example.kotlin_coroutines D/hola: Starting task 2
2023-06-27 01:34:39.386 17532-17532/com.example.kotlin_coroutines D/hola: Ending task 1
2023-06-27 01:34:39.387 17532-17532/com.example.kotlin_coroutines D/hola: Ending Task 2
*
* */
