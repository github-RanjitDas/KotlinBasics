package com.example.kotlinbasics

fun main(){
    println("Enter your age as a whole number:")
    var age = readln().toInt()
    if(age in 18..40){
        println("You can enter to the club")
    }else if(age > 40){
        println("Go home Old Man")
    }else{
        println("Age can not be verified, Please contact support")
    }
}