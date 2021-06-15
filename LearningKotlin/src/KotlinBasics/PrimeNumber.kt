package KotlinBasics

fun main(args:Array<String>){
    println("Enter an integer number")
    var num = Integer.valueOf(readLine())
    var isPrime :Boolean= true
    for (i in 2..num - 1){
        if( num % i == 0){
            isPrime = false
            break
        }
    }
    if(isPrime && num > 1)
        println("$num is a Prime number")
    else
        println("$num is not a Prime number")
}