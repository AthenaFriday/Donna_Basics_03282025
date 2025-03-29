package com.example.project1.exercises

import java.util.Scanner

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
    data class Card(val companyName: String, var expiration: String)

    val reader = Scanner(System.`in`)
    print("Please enter a valid card number: ")


    var cardInput: String = reader.nextLine().filter{it.isDigit()}

    while (cardInput.length != 16){
       println("Card number: must be exactly 16 digits")
        print("Please enter a valid card number: ")
        cardInput = reader.nextLine().filter{it.isDigit()} ?: "0"

    }

    print("Please enter the expiration date: ")
    var exDate = reader.nextLine().filter{it.isDigit()}

    fun Card.validate(cardNum: String, expirationDate: String) {
        if (cardNum.take(4) == this.companyName.takeLast(4) && cardNum.takeLast(4) == expirationDate) {
            print("Card number ending in ${cardNum.takeLast(4)} is valid")
        } else {
            print("Card number ending in ${cardNum.takeLast(4)} is invalid")
        }
    }
    val card = Card("ACME 1121",  "1027")

    card.validate(cardInput, exDate)
    reader.close()
}
