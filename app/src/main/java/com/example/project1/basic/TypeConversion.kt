package com.example.project1.basic

fun typeconversion(){
    var test = 12
// Int smart cast from Number
    println("$test")

    var test1 = test.toLong()
// Long smart cast from Number
    println("$test1")

    // must explicityly convert to different data type
    // toChar() only converts from int not string

    var test3 : Int
    test3= 97// must be valid unicode
    val test4 =test3.toChar()
    println(test4)

// String type conversion to char
    var string : String//explicitly calling a string
    string = "1234"
    var long = string.toLong()
    var double = string.toDouble()
    var int = string.toInt()
    var char = string[1] //creates a character 2


}