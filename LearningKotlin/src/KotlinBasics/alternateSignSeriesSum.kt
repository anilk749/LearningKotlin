package KotlinBasics

import java.util.*

fun main(args:Array<String>){
    val read = Scanner(System.`in`)
    println("Calculate the sum alternate sign series (1-1/2+1/3-1/4+...1/n)")
    println("Enter the value of n ")
    val n :Int= read.nextInt()
    var sum :Double = 0.0
    for (i in 1..n){
        if(i % 2 == 0)
            sum -= 1.0/i
        else
            sum += 1.0/i
    }
    //rounding off upto 5 decimal places
   sum = Math.round(sum * 10000.0)/10000.0
   // another way : val sumWithRoundOff:Double = String.format("%.4f",sum).toDouble()
    println("Sum is : $sum")
}