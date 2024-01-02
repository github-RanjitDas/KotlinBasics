package com.example.kotlinbasics


fun main(){
    println("What is the first number")
    val num1 = readln().toDouble()
    println("What is the Second number")
    val num2 = readln().toDouble()
    ////////////////////////////////


    val showResult= numDivide(num1, num2)
    println("The result is $showResult")


}

// Define numberAdd function
fun numAdd(a: Int, b: Int): Int {
    return a + b
}

// Define numberDivide function
fun numDivide(a: Double, b: Double): Double {
    return a / b
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