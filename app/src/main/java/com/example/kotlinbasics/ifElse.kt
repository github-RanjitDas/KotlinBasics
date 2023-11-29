package com.example.kotlinbasics

fun main(){
    println("Please enter your age")
    val age = readln().toInt()
    //or we can write "val enteredValue = readln()
    //                 age = enteredValue.toInt"

    if (age >= 18){
        println("Person can enter to the club")
    }else{
        println("Person can not enter to the club")
    }
}