package KotlinBasics

fun main(args:Array<String>){
    println("To compute cosx = 1 - x^2/2! + x^4/4!-....x^n/n!")
    println("Enter an value of x ")
    val x :Int = Integer.valueOf(readLine())
//    println("Enter an value of n ")
//    var n :Int = Integer.valueOf(readLine())
    val n = 2..6
    val n2 = n.step(2)
    var sum :Double = 1.0
    var sign = 1
    for (i in n2){
        var power :Int = 1
        var fact :Int = 1
        for (j in 1..i){
            power *= x
            fact *= j
        }
        sum = sum - (power * sign).toDouble()/fact
        sign *= -1
    }
    println("Value of cos$x is : $sum")
}