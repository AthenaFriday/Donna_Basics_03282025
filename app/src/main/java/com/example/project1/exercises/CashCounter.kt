package com.example.project1.exercises

import java.lang.System.*
import java.util.Scanner



fun main(){
    var reader = Scanner(System.`in`)
    print("Enter purchase price: ")
    val price= reader.nextDouble()
    print("Enter amount tendered: ")
    val cash = reader.nextDouble()
    var input = "$price;$cash"


    changeCounter(input)

    reader.close()
}

fun changeCounter(input: String) {
  val purchasePrice = input.split(";").get(0).toDouble()
    val tendered = input.split(";").last().toDouble()
     if (tendered < purchasePrice){
        println("Error! Purchase Price is greater than cash tendered")
        return
    } else if (tendered == purchasePrice){
        println(" Your Change is ZERO:  Exact amount tendered ")
        return
    }
    var change = (tendered *100).toInt() - (purchasePrice *100).toInt()
    println("Your change is : ")

    while(change > 0){
        when {
            change >= 10000 -> {
                println("${change/10000} x HUNDRED(S)")
                change %= 10000
            }
            change >= 5000 -> {
                println("${change/5000} x Fifty")
                change %= 5000
            }
            change >= 2000 -> {
                println("${change/2000} x TWENTY(S)")
                change %= 2000
            }
            change >= 1000 -> {
                println("${change/1000} x TEN")
                change %= 1000
            }
            change >= 500 ->{
                println("${change/500} x FIVE")
                change %= 500
            }
            change >= 200 ->{
                println("${change/200} x TWO(S)")
                change %= 200
            }
            change >= 100 ->{
                println("${change/100} x ONE")
                change %= 100
            }
            change >= 50 ->{
                println("${change/50} x HALF DOLLAR")
                change %= 50
            }
            change >= 25 ->{
                println("${change/25} x QUARTER(S)")
                change %= 25
            }
            change >= 10 ->{
                println("${change/10} x DIME(S)")
                change %= 10
            }
            change >= 5->{
                println("${change/5} x NICKLE")
                change %= 5
            }

            else -> {println("$change x PENNY(S)")
                change = 0;}


        }

    }


}
