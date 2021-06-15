package KotlinBasics

fun main(args:Array<String>){
    println("Enter an integer number")
    var num = Integer.valueOf(readLine())
   // var fact :Int = 1
    // one way
//    for (i in 1..num){
//        fact *= i
//    }
    // Second way by recursion
    val factorial:Int = fact(num)
    println("Factorial of $num is : $factorial")
}
fun fact(num:Int):Int {
    return if (num == 1) {
        num
    }else {
        num * fact(num - 1)
    }
}