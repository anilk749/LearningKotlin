package recursion

fun main(args:Array<String>){
    val factorial = fact(5)
    println("factorial of 5 is :$factorial ")
}
fun fact(n:Int):Int {
    if (n == 1)
        return 1

    return  n * fact(n - 1)
}