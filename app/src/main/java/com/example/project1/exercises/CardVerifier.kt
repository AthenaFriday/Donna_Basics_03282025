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
    print("Enter a Card Number: ")


    var cardInput: String = reader.nextLine()
    // sanatize number
    var cardNumber = cardInput.filter{it.isDigit()}
    if (cardNumber.length ==16) {

        print("enter the expiration date: ")
    } else {
        print(" Invalid card number, please try again.")

    }
    val reader1 = Scanner(System.`in`)
    cardInput= reader1.nextLine()
    var exDate = cardInput.filter{it.isDigit()}

    fun Card.validate(cardNum: String) {
        if (cardNum.take(4) == this.companyName.takeLast(4) && cardNum.takeLast(4) == this.expiration) {
            print("Card number ending in ${cardNum.takeLast(4)} is valid")
        } else {
            print("Card number ending in ${cardNum.takeLast(4)} is invalid")
        }
    }
 val card = Card("ACME 1121",  exDate)

    card.validate(cardNumber)

}
