package KotlinBasics

fun main(args:Array<String>){
    println("To compute sinx = x - x^3/3! + x^5/5!-....x^n/n!")
    println("Enter an value of x ")
    val x :Int = Integer.valueOf(readLine())
    println("Enter an value of n ")
    var n :Int = Integer.valueOf(readLine())
    val n2 = (1..n).step(2)
    var sum :Double = 0.0
    var sign = 1
    for (i in n2){
        var power :Int = 1
        var fact :Int = 1
            for (j in 1..i){
                power *= x
                fact *= j
            }
        sum = sum + (power * sign).toDouble()/fact
        sign *= -1
    }
    println("Value of sin$x is : $sum")
}