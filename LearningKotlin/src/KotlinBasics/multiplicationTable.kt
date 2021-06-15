package KotlinBasics

fun main(args:Array<String>){
    println("Enter a positive integer")
    val num :Int = Integer.valueOf(readLine())
    var product:Int = 1
    for (i in 1..10){
        product= num * i
        println("$num * $i = $product")
    }
}