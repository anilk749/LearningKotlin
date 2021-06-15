package KotlinBasics

import java.util.ArrayList

class Solution {
    fun fizzBuzz(number: Int): List<String> {
        // ans list
        val ansr: MutableList<String> = ArrayList()
        for (num in 1..number) {
            val divisibleBy3 = num % 3 == 0
            val divisibleBy5 = num % 5 == 0
            var numAnsrStr = ""
            if (divisibleBy3) {
                // Divides by 3, add Fizz
                numAnsrStr += "Fizz"
            }
            if (divisibleBy5) {
                // Divides by 5, add Buzz
                numAnsrStr += "Buzz"
            }
            if (numAnsrStr == "") {
                // Not divisible by 3 or 5, add the number
                numAnsrStr += Integer.toString(num)
            }

            // Append the current answer str to the ans list
            ansr.add(numAnsrStr)
        }
        return ansr
    }
}
fun main(args:Array<String>){
    val obj = Solution()
    println("Enter a positive number")
    val number :Int = Integer.valueOf(readLine())
    println(obj.fizzBuzz(number))
}