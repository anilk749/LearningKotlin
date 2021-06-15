package KotlinBasics

fun main(args:Array<String>){
    println("Enter a number")
    var num:Int = Integer.valueOf(readLine())
    // variable oddSum to store sum of odd numbers
    var oddSum :Int = 0
    // variable evenSum to store sum of even numbers
    var evenSum :Int = 0
    for(i in 1..num){
        if(i % 2 == 0)
            evenSum += i
        else
            oddSum += i
    }
    println("Even numbers sum under $num is : $evenSum")
    println("Odd numbers sum under $num is : $oddSum")
}