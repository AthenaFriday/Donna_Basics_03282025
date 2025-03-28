package com.example.project1.exercises

/*
* Banks
* - list of banks -
* ACME 1121
* ALFA 1111
* AMEX 3796
*
* Sample input
*
* First input -> 1121-0000-0000-0312
* Second input -> 03/12
*
* -> First 4 digit represent company
* -> Last 4 digit represent expiry date
*
*   Assuming card and date as input write a function to verify valid card numbers
* */

fun main() {
    data class  Card( val companyName : String,var  expirationMonth: Int, var expirationYear: Int )


    fun Card.validate(cardNum: String) =
        if(cardNum.subSequence(0,3)==companyName.subSequence(5,8) && cardNum.subSequence(15,16)==expirationMonth.toString() && cardNum.subSequence(17,18)==expirationYear.toString()
        ){ print("valid")}
        else {print("invalid")}
}