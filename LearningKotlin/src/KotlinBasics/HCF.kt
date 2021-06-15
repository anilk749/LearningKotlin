package KotlinBasics

import java.util.*

fun main(args:Array<String>){
    val read = Scanner(System.`in`)
    println("To calculate HCF of two numbers")
    println("Enter higher number")
    var num1:Int = read.nextInt()
    println("Enter smaller number")
    var num2:Int = read.nextInt()
    while (num2 != 0){
       var rem:Int = num1 % num2
        num1 = num2
        num2 = rem
    }
    println("HCF is : $num1")
}
