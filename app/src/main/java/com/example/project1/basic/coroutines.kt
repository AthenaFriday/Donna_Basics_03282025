package com.example.project1.basic

import kotlinx.coroutines.*

//coroutine = green thread / lightwieght thread/
// parallel + concurrent apps
/* suspend keyword makes function suspendable without blocking threads
* can only be called from another suspend function or a coroutine
*/
suspend fun bathTime( ){
    println("Going to the bathroom")
    delay(500L) // suspends the computation
    println("bath done")
}

suspend fun boilWater(){
    print("put water on stove")
    delay(2000)
    println("water boiled")
}


suspend fun sequentialRoutine(){
    coroutineScope{ // starts a context for coroutines
        bathTime()
        //all the code in this scope will need to finish before scope is closed
    }
    coroutineScope {
        boilWater()
    }
}

suspend fun concurrentRoutine(){
    coroutineScope {
        launch{ boilWater() }// this launch is a CHILD of the coroutine scope : if the parent is closed the child is closed.
        launch { bathTime() } //runs concurrently : analogous to starting a new thread
    }
}
suspend fun main (){
    sequentialRoutine()

}