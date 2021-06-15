package KotlinBasics

import java.util.*

fun main(args:Array<String>) {
    val read = Scanner(System.`in`)
    var num1: Int
    var num2: Int
    var sum: Int = 0
    var charr :Char
    do {
        println("Enter a first number")
        num1 = Integer.valueOf(readLine())
        println("Enter a second number")
        num2 = Integer.valueOf(readLine())
        println("Sum of $num1 and $num2 is : ${num1 + num2}")
        println("Do you want to continue ? : y/n")
        charr = read.next().single()
    } while (charr == 'y')
}