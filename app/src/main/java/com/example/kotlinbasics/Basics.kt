package com.example.kotlinbasics


fun main(){
    println("What is the first number")
    val num1 = readln().toInt()
    println("What is the Second number")
    val num2 = readln().toInt()
    ////////////////////////////////
    val showResult= numAdd(num1, num2)
    println("The result is $showResult")

}

// Define numberAdd function
fun numAdd (a : Int,b : Int) : Int{
    var result= a+b
    return result
}







// Define makeCoffee function
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