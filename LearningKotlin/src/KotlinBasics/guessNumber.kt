package KotlinBasics

import java.util.*

fun main(args:Array<String>) {
    val read = Scanner(System.`in`)
    var randomnum: Int = (0..50).random()
    var guessNum: Int
    var count:Int = 0
    do {
        println("Guess a number between 1 to 50")
        guessNum = Integer.valueOf(readLine())
        count++
        if(guessNum < randomnum)
            println("Too low,try again.")
        else if(guessNum > randomnum)
            println("Too high,try again.")
        else {
            println("Hurray ! Your Guess is right")
            println("You guessed the number in $count attempts")
            }
    } while (guessNum !== randomnum)
}