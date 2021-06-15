package KotlinBasics

import java.util.*

fun main(args:Array<String>) {
    val read = Scanner(System.`in`)
    var num: Int
    var positiveNumCount:Int = 0
    var negativeNumCount:Int = 0
    var zeroNumCount:Int = 0
    var charr :Char
    do {
        println("Enter a number")
        num = Integer.valueOf(readLine())
        if(num < 0)
            negativeNumCount++
        else if(num > 0)
            positiveNumCount++
        else
            zeroNumCount++
        println("Do you want to continue ? : y/n")
        charr = read.next().single()
    } while (charr == 'y')
    println("You entered $zeroNumCount zero")
    println("You entered $positiveNumCount positive numbers")
    println("You entered $negativeNumCount negative numbers")
}