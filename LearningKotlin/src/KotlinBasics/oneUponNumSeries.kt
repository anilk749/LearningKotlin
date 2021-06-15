package KotlinBasics

import java.util.*

fun main(args:Array<String>) {
    val read = Scanner(System.`in`)
    println("Enter n ")
    val number: Int = read.nextInt()
    var sum:Double = 0.0
    for (num in 1..number){
        sum += 1.0/num
    }
    // Rounding off the sum to 3 decimal places
   // val sumWithRoundOff:Double = String.format("%.3f",sum).toDouble()
    val sumWithRoundOff:Double = Math.round(sum * 1000.0)/1000.0
    println("Sum of series 1 + 1/2 +1/3...1/n  upto $number places is : $sumWithRoundOff")
}