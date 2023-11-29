package com.example.kotlinbasics

fun main(){
    println("Please enter a number")
    var inputString = readln()
    var inputNumbner = inputString.toInt()
    val multiplier = 5
    println("Result of operation is:" + inputNumbner*multiplier)
}