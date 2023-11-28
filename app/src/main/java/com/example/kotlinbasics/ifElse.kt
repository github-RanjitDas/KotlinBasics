package com.example.kotlinbasics

fun main(){
    val age = readln().toInt()

    if (age >= 18){
        println("Person can enter to the club")
    }else{
        println("Person can not enter to the club")
    }
}