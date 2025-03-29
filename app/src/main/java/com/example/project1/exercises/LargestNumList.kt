package com.example.project1.exercises

fun main(){
//list to test
    val ls = listOf(3,9,6,1,3)
    print(largestNum(ls,4))
}

fun largestNum( nums: List<Int>, count:Int): List<Int> {
    if(nums.isEmpty()){return nums}
    val sortedNums =nums.sortedDescending()
if (nums.size > count){

    return sortedNums.take(count)
}
   return nums
}