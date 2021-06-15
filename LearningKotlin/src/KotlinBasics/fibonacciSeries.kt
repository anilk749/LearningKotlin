package KotlinBasics

fun main(args:Array<String>){
    println("Enter a positive number")
    var num:Int = Integer.valueOf(readLine())
   // a is first number of Fibonacci Series
    var a : Int = 0
    // b is second number of Fibonacci Series
    var b : Int = 1
    // c gives next number of Fibonacci Series
    var c : Int = 0
    print("Fibonacci series is : $a" + " ")
    print("$b" + " ")
    for (i in 3..num){
        c = a + b
        a = b
        b = c
        print("$c" + " ")
    }
}