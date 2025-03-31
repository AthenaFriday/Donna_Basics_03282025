package com.example.project1.exercises

fun main(){
print(findEvenFib(34))
}
fun findEvenFib(num : Int): List<Int>{
val ls: MutableList<Int> = mutableListOf(0,1)
// fill the list
for(i in 2..num){
    ls.add(ls.get(i-1) + ls.get(i-2))
}
    ls.removeAt(0)

    val result =ls.filter{it %2 == 0}.filter{it <= num}

   return  result
}