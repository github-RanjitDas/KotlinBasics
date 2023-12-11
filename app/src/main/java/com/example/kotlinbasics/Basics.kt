package com.example.kotlinbasics


fun main(){
    makeCoffee(1, "Sukuta") //Calling the function
    makeCoffee(2, "Ranjit") //Calling the function
    makeCoffee(29, "Haria") //Calling the function

}

// Define function
fun makeCoffee(sugarCount : Int, name : String) =
    when(sugarCount){
        0 -> {
            println("Coffee with no sugar added for $name")
        }
        1 -> {
            println("Coffee with $sugarCount spoon of sugar for $name")
        }
        else -> {
            println("Coffee with $sugarCount spoons of sugar for $name")
        }
    }