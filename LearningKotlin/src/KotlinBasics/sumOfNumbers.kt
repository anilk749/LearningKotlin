package KotlinBasics

fun main(args:Array<String>){
    println("Enter an integer number")
    val num = Integer.valueOf(readLine())
    var sum :Int = 0
    for (i in 1..num){
        sum += i
    }
    println("Sum of first $num natural numbers is : $sum")
}